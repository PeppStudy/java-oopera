public class Ballet extends MusicalShow {

    private final Choreographer choreographer;

    public Ballet(String title, Director director, int duration, MusicAuthor musicAuthor,
                  String librettoText, Choreographer choreographer) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
