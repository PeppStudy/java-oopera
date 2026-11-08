public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, Director director, int duration, MusicAuthor musicAuthor) {
        super(title, director, duration, musicAuthor);
        setLibretto("Это оперное либретто");
    }

}
