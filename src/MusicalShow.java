public class MusicalShow extends Show {

    protected final MusicAuthor musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, Director director, int duration, MusicAuthor musicAuthor, String librettoText) {
        super(title, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibretto() {
        return librettoText;
    }

    public void printLibrettoText() {
        String composer = musicAuthor.toString();
        System.out.println(title + " Композитор: " + composer);
        System.out.println(getLibretto());
        System.out.println("");
    }

}
