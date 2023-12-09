package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.Entity.Applicants;
import org.example.schoolMangement.Entity.Courses;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.enums.Course_title;
import org.example.schoolMangement.enums.Department;
import org.example.schoolMangement.enums.Job;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TeacherServiceImplTest {
TeacherServiceImpl teacherService = new TeacherServiceImpl();
    @Test
    void record_performance() {
        Students students= new Students();
        Courses courses = new Courses();
        Staff staff= new Staff(Job.PRINCIPAL);
        students.setFirstName("Peter");
        staff.setJob(Job.TEACHER);
        assertTrue(staff.getJob()  == Job.TEACHER, "the teacher records the performance of the Students");


    }

    @Test
    void teach() {
        Map<Course_title, Department> listOfcoursesInDepartment = new HashMap<>();
        Students students= new Students();
        Courses courses = new Courses();
        Staff staff= new Staff(Job.PRINCIPAL);
        students.setFirstName("Peter");
        staff.setJob(Job.TEACHER);
        assertTrue(staff.getJob()  == Job.TEACHER, String.valueOf(listOfcoursesInDepartment.put(courses.getCourse_title(), courses.getDepartment())));


    }
}