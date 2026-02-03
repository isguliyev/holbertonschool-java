package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.HashSet;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "course_student",
        joinColumns = @JoinColumn(name = "courseId"),
        inverseJoinColumns = @JoinColumn(name = "studentId")
    )
    private Set<Student> students;
    @OneToOne(mappedBy = "course", cascade = CascadeType.ALL)
    private CourseMaterial courseMaterial;
    @ManyToOne
    @JoinColumn(name = "teacherId", referencedColumnName = "id")
    private Teacher teacher;

    public Course() {
        this.students = new HashSet<Student>();
    }
}