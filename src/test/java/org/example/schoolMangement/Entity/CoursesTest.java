package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Course_title;
import org.example.schoolMangement.enums.Department;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoursesTest {

    @Test
    void getEnrolledStudentsTest() {
        Courses course = new Courses();
        course.setEnrolledStudents(25);
        assertEquals(25, course.getEnrolledStudents());

    }

    @Test
    void setEnrolledStudents() {
        Courses course = new Courses();
        course.setEnrolledStudents(15);
        assertEquals(15, course.getEnrolledStudents());
    }

    @Test
    void getCourse_title() {
        Courses course = new Courses();
        course.setCourse_title(Course_title.BIOLOGY);
        assertEquals(Course_title.BIOLOGY, course.getCourse_title());
    }

    @Test
    void setCourse_title() {
        Courses course = new Courses();
        course.setCourse_title(Course_title.ACCOUNTING);
        assertEquals(Course_title.ACCOUNTING, course.getCourse_title());

    }

    @Test
    void getDepartment() {
        Courses course = new Courses();
        course.setDepartment(Department.ART);
        assertEquals(Department.ART, course.getDepartment());
    }

    @Test
    void setDepartment() {
        Courses course = new Courses();
        course.setDepartment(Department.SCIENCE);
        assertEquals(Department.SCIENCE, course.getDepartment());
    }

    @Test
    void getCourse_teacher() {
        Courses course = new Courses();
        course.setCourse_teacher("Olanipekun");
        assertEquals("Olanipekun", course.getCourse_teacher());
    }

    @Test
    void setCourse_teacher() {
        Courses course = new Courses();
        course.setCourse_teacher("James");
        assertEquals("James", course.getCourse_teacher());
    }
}