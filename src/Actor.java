import java.util.Objects;

public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, Gendre gendre, int height) {
        super(name, surname, gendre);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Actor actor = (Actor) o;
        return Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return surname + " " + name + " (" + height + " см)";
    }

    public String toStringAsPerson() {
        return super.toString();
    }

}
