import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        // Создаем трех артистов
        Actor sidorov1 = new Actor("Иван", "Сидоров", Gendre.MALE, 185);
        Actor sidorov2 = new Actor("Василий", "Сидоров", Gendre.MALE, 190);
        Actor tomilina = new Actor("Татьяна", "Томилина", Gendre.FEMALE, 178);

        // Создаем двух режиссеров
        Director playDirector = new Director("Юрий", "Любимов", Gendre.MALE);
        Director operaDirector = new Director("Константин", "Станиславский", Gendre.MALE);

        // Создаем композитора
        MusicAuthor composer = new MusicAuthor("Пётр", "Чайковский");

        // Создаем хореографа
        Choreographer choreographer = new Choreographer("Мариус", "Петипа");

        Show play = new Show("Гамлет", playDirector, 150);
        Opera opera = new Opera("Пиковая дама", operaDirector, 180, composer);
        Ballet ballet = new Ballet("Лебединое озеро", operaDirector, 90, composer, choreographer);

        // Добавляем артистов в драмспектакль и выводим список
        ArrayList<Actor> playCast = new ArrayList<>();
        play.addActor(playCast, sidorov1);
        play.addActor(playCast, tomilina);

        play.printCastList(playCast);

        // Добавляем артистов в оперный спектакль и выводим список
        ArrayList<Actor> operaCast = new ArrayList<>();

        opera.addActor(operaCast, sidorov1);
        opera.addActor(operaCast, sidorov2);

        opera.printCastList(operaCast);

        // Добавляем артистов в балетный спектакль и выводим список
        ArrayList<Actor> balletCast = new ArrayList<>();
        ballet.addActor(balletCast, sidorov1);

        ballet.printCastList(balletCast);

        // Заменяем артистов и выводим список нового состава
        opera.replaceActor(playCast, sidorov2, "Томилина");
        opera.printCastList(playCast);

        // Заменяем несуществующего артиста и выводим список
        opera.replaceActor(playCast, sidorov2, "Михайлов");
        opera.printCastList(playCast);

        // Печатаем либретто оперы
        opera.printLibrettoText();

        // Печатаем либретто оперы
        ballet.printLibrettoText();

    }
}
