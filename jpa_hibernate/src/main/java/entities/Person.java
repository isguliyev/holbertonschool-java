package entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private int age;
    private String cpf;
    private LocalDate birthDate;

    @Override
    public String toString() {
        return String.format(
            "Person(id=%d, name=%s, email=%s, age=%d, cpf=%s, birthDate=%s)",
            this.id,
            this.name,
            this.email,
            this.age,
            this.cpf,
            this.birthDate
        );
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public String getCpf() {
        return this.cpf;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        this.age = birthDate.until(LocalDate.now()).getYears();
    }
}