import java.io.Serializable;

public class Student implements Serializable {
    private int age;
    private String name;
    private transient String password;

    public Student(int age, String name, String password) {
        setAge(age);
        setName(name);
        setPassword(password);
    }

    @Override
    public String toString() {
        return String.format("Student { name='%s', age='%d', password='%s' }",
            this.name,
            this.age,
            this.password);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}