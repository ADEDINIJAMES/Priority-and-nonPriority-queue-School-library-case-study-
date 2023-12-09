package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.Entity.Courses;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.enums.Job;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    @Test
    void registerTest() {
        Students students= new Students();
        Courses courses = new Courses();
        Staff staff= new Staff(Job.PRINCIPAL);
        students.setFirstName("Peter");
        staff.setJob(Job.TEACHER);
        assertTrue(staff.getJob()==Job.TEACHER, students.getFirstName() + " "+ students.getLastName()+ " Congratulations and Welcome to this new class");

    }

    @Test
    void takeCourse() {
        Students students= new Students();
        Courses courses = new Courses();
        Staff staff= new Staff(Job.PRINCIPAL);
        students.setFirstName("Peter");
        staff.setJob(Job.TEACHER);
assertTrue(students.getFirstName() != null, students.getFirstName() + " "+ students.getLastName()+ " "+" now takes this course");
    }
}