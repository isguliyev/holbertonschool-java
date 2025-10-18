import java.util.Objects;

public class Author implements Comparable<Author> {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Author other = (Author)object;

        return other.getName().equals(this.name)
            && other.getSurname().equals(this.surname);
    }

    @Override
    public int compareTo(Author other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.surname);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}