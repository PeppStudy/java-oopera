import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected Gendre gendre;

    public Person(String name, String surname, Gendre gendre) {
        this.name = name;
        this.surname = surname;
        this.gendre = gendre;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gendre == person.gendre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gendre);
    }

    public String getSurname() {
        return surname;
    }
}
