package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;

import lombok.Setter;
import lombok.Getter;

import java.util.Set;
import java.util.HashSet;

@Getter
@Setter
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER)
    private Set<Course> courses;

    public Teacher() {
        this.courses = new HashSet<Course>();
    }
}