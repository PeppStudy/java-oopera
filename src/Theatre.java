public class Theatre {

    public static void main(String[] args) {

        // Создаем трех артистов
        Actor sidorov1 = new Actor("Иван", "Сидоров", Gender.MALE, 185);
        Actor sidorov2 = new Actor("Василий", "Сидоров", Gender.MALE, 190);
        Actor tomilina = new Actor("Татьяна", "Томилина", Gender.FEMALE, 178);

        // Создаем двух режиссеров
        Director playDirector = new Director("Юрий", "Любимов", Gender.MALE, 50);
        Director operaDirector = new Director("Константин", "Станиславский", Gender.MALE, 48);

        // Создаем композитора
        MusicAuthor composer = new MusicAuthor("Пётр", "Чайковский");

        // Создаем хореографа
        Choreographer choreographer = new Choreographer("Мариус", "Петипа");

        Show play = new Show("Гамлет", playDirector, 150);
        Opera opera = new Opera("Пиковая дама", operaDirector, 180, composer,
                "Это оперное либретто", 70);
        Ballet ballet = new Ballet("Лебединое озеро", operaDirector, 90, composer, "Это балетное " +
                "либретто", choreographer);

        // Добавляем артистов в драмспектакль и выводим список
        play.addActor(sidorov1);
        play.addActor(tomilina);

        play.printCastList();

        // Добавляем артистов в оперный спектакль и выводим список
        opera.addActor(sidorov1);
        opera.addActor(sidorov2);

        opera.printCastList();

        // Добавляем артистов в балетный спектакль и выводим список
        ballet.addActor(sidorov1);

        ballet.printCastList();

        // Заменяем артистов и выводим список нового состава
        opera.replaceActor(tomilina, "Сидоров");
        opera.printCastList();

        // Заменяем несуществующего артиста и выводим список
        ballet.replaceActor(tomilina, "Михайлов");
        ballet.printCastList();

        // Печатаем либретто оперы
        opera.printLibrettoText();

        // Печатаем либретто балета
        ballet.printLibrettoText();

    }
}
