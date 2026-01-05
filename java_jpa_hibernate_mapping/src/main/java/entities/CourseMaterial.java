package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@Entity
@Table(name = "course_material")
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    @OneToOne
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    private Course course;
}