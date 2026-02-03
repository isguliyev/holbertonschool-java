package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.HashSet;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private Set<Course> courses;
    @OneToMany(
        mappedBy = "student",
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER,
        orphanRemoval = true
    )
    private Set<Address> addresses;
    @OneToMany(
        mappedBy = "student",
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER,
        orphanRemoval = true
    )
    private Set<Phone> phones;

    public Student() {
        this.courses = new HashSet<Course>();
        this.addresses = new HashSet<Address>();
        this.phones = new HashSet<Phone>();
    }
}