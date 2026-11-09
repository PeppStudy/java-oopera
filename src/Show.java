import java.util.ArrayList;

public class Show {

    protected final String title;
    protected final Director director;
    protected final int duration;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, Director director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        listOfActors = new ArrayList<>();
    }

    private boolean isExisting(Actor newActor) {
            if (listOfActors.contains(newActor)) {
                System.out.printf("Артист %s уже задействован в спектакле%n", newActor.toStringAsPerson());
                return true;
            }
        return false;
    }

    public void addActor(Actor newActor) {
        if (!isExisting(newActor)) {
            listOfActors.add(newActor);
            System.out.println(newActor.toString() + " добавлен");
        }
    }

    public void replaceActor(Actor newActor, String existentActorSurname) {
        if (!isExisting(newActor)) {
            boolean isFound = false;
            for (int i = 0; i < listOfActors.size(); i++) {
                if (listOfActors.get(i).getSurname().equals(existentActorSurname)) {
                    if (!isFound) {
                        isFound = true;
                        listOfActors.set(i, newActor);
                    }
                    else {
                        System.out.printf("В списке артистов найдено несколько совпадений по фамилии!%n" +
                                "Было заменено первое совпадение%n");
                    }
                }
            }

            if (!isFound) {
                System.out.printf("В списке нет артиста с фамилией %s. Заменять некого%n", existentActorSurname);
            }
        }
    }


    // Список артистов явно указывается в параметрах, так как в спектакле
    // обычно заняты несколько составов исполнителей
    public void printCastList() {
        System.out.println("В спектакле \"" + title + "\" сегодня участвуют:");
        if (listOfActors.isEmpty()) {
            System.out.printf("*****************Спектакль отменен*****************%n" +
                    "***Приносим извинения за доставленные неудобства***%n");
        }
        else {
            for (Actor actor : listOfActors) {
                System.out.println(actor.toString());
            }
            System.out.println("");
        }
    }
}
