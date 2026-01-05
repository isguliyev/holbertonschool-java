package demo;

import entities.Student;
import entities.Address;
import entities.Phone;
import entities.Teacher;
import entities.Course;
import entities.CourseMaterial;

import models.CourseModel;
import models.StudentModel;
import models.TeacherModel;

import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManagerFactory;

public class CourseManagementMain {
    public static void main(String[] args) {
        try (
            EntityManagerFactory entityManagerFactory
            = Persistence.createEntityManagerFactory("course-management-jpa")
        ) {
            CourseModel courseModel = new CourseModel(entityManagerFactory);
            StudentModel studentModel = new StudentModel(entityManagerFactory);
            TeacherModel teacherModel = new TeacherModel(entityManagerFactory);

            Student student = new Student();
            student.setData("student-data");

            Address address = new Address();
            address.setData("address-data");

            Phone phone = new Phone();
            phone.setData("phone-data");

            Teacher teacher = new Teacher();
            teacher.setData("teacher-data");

            Course course = new Course();
            course.setData("course-data");

            CourseMaterial courseMaterial = new CourseMaterial();
            courseMaterial.setData("courseMaterial-data");

            courseModel.create(course);
            studentModel.create(student);
            teacherModel.create(teacher);

            System.out.println(courseModel.findById(course.getId()));
            System.out.println(studentModel.findById(student.getId()));
            System.out.println(teacherModel.findById(teacher.getId()));

            address.setStudent(student);

            course.getStudents().add(student);
            course.setCourseMaterial(courseMaterial);
            course.setTeacher(teacher);

            courseMaterial.setCourse(course);

            phone.setStudent(student);

            student.getAddresses().add(address);
            student.getPhones().add(phone);
            student.getCourses().add(course);

            teacher.getCourses().add(course);

            course = courseModel.update(course);
            student = studentModel.update(student);
            teacher = teacherModel.update(teacher);

            System.out.println(course.getStudents());
            System.out.println(course.getCourseMaterial());
            System.out.println(course.getTeacher());

            System.out.println(student.getAddresses());
            System.out.println(student.getPhones());
            System.out.println(student.getCourses());

            System.out.println(teacher.getCourses());

            courseModel.deleteById(course.getId());
        }
    }
}