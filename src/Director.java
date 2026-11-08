public class Director extends Person {

   private int numberOfShows;

    public Director(String name, String surname, Gendre gendre) {
        super(name, surname, gendre);
    }

        public void printDirector() {
            System.out.printf("Режиссер спектакля: %s",super.toString());
        }
}
