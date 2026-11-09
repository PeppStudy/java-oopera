import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
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
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && (gender == person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }

    public String getSurname() {
        return surname;
    }
}
