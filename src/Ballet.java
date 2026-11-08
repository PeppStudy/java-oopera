public class Ballet extends MusicalShow {

    private final Choreographer choreographer;

    public Ballet(String title, Director director, int duration, MusicAuthor musicAuthor, Choreographer choreographer) {
        super(title, director, duration, musicAuthor);
        this.choreographer = choreographer;
        setLibretto("Это балетное либретто");
    }
}
