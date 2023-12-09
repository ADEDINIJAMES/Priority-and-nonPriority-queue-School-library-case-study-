package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Category;
import org.example.schoolMangement.enums.Department;
import org.example.schoolMangement.enums.LevelName;
import org.example.schoolMangement.enums.Terms;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    void getGuardian_nameTest(){
    Students students= new Students();
    students.setGuardianName("Adebayo");
    assertEquals("Adebayo", students.getGuardianName());

    }

    @Test
    void setGuardian_nameTest1() {
        Students students= new Students();
        students.setGuardianName("Francis");
        assertEquals("Francis", students.getGuardianName());
    }

    @Test
    void getGuardian_phoneTest1() {
        Students students= new Students();
        students.setGuardianPhone(803423444L);
        assertEquals(803423444L, students.getGuardianPhone());
    }

    @Test
    void setGuardian_phoneTest1() {
        Students students= new Students();
        students.setGuardianPhone(90323455L);
        assertEquals(90323455L, students.getGuardianPhone());
    }

    @Test
    void getLevelTest1() {
        Students students= new Students();
        students.setLevel(LevelName.SSS_2);
        assertEquals(LevelName.SSS_2, students.getLevel());
    }


    @Test
    void setLevelTest1() {
        Students students= new Students();
        students.setLevel(LevelName.SSS_3);
        assertEquals(LevelName.SSS_3, students.getLevel());

    }

    @Test
    void getDepartmentTest1() {
        Students students= new Students();
        students.setDepartment(Department.SCIENCE);
        assertEquals(Department.SCIENCE, students.getDepartment());
    }

    @Test
    void setDepartmentTest1() {
        Students students= new Students();
        students.setDepartment(Department.ART);
        assertEquals(Department.ART, students.getDepartment());
    }

    @Test
    void getNoOfCoursesTest1() {
        Students students= new Students();
        students.setNoOfCourses(12);
        assertEquals(12, students.getNoOfCourses());
    }

    @Test
    void setNo_Of_CoursesTest1() {
        Students students= new Students();
        students.setNoOfCourses(20);
        assertEquals(20, students.getNoOfCourses());
    }

    @Test
    void getSemesterTest1() {
        Students students= new Students();
        students.setSemester(Terms.FIRST);
        assertEquals(Terms.FIRST, students.getSemester());
    }

    @Test
    void setSemesterTest1() {
        Students students= new Students();
        students.setSemester(Terms.SECOND);
        assertEquals(Terms.SECOND, students.getSemester());
    }

    @Test
    void getCoursesTest1() {
        Students students= new Students();
        List<Students> studentsList= new ArrayList<>();
        studentsList.add(students);
        assertEquals(1, studentsList.size());

    }

    @Test
    void setCoursesTest1() {
        Students students= new Students();
        List<Students> studentsList= new ArrayList<>();
        studentsList.add(students);
        studentsList.add(students);
        assertEquals(2, studentsList.size());


    }

    @Test
    void getGrade() {
        Students students= new Students();
        students.setGrade(20);
        assertEquals(20, students.getGrade());


    }

    @Test
    void setGrade() {
        Students students= new Students();
        students.setGrade(100);
        assertEquals(100, students.getGrade());

    }

    @Test
    void getCategory() {
        Students students= new Students();
        students.setCategory(Category.New);
        assertEquals(Category.New, students.getCategory());

    }

    @Test
    void setCategory() {
        Students students= new Students();
        students.setCategory(Category.Returning);
        assertEquals(Category.Returning, students.getCategory());

    }

    @Test
    void getPaymentTest() {
        Students students = new Students();
        BigDecimal b = new BigDecimal(500000);
        students. setPayment(b);
        assertEquals(b, students.getPayment());
    }

    @Test
    void setPaymentTest() {
        Students students = new Students();
        BigDecimal y = new BigDecimal(5000000);
        students. setPayment(y);
        assertEquals(y, students.getPayment());


    }

    @Test
    void getDateOfAdmissionTest() {
        Students students = new Students();

        students.setDateOfAdmission(LocalDate.parse("2023-02-24"));
        assertEquals(LocalDate.parse("2023-02-24"), students.getDateOfAdmission());
    }

    @Test
    void setDate_Of_Admission() {
        Students students = new Students();

        students.setDateOfAdmission(LocalDate.parse("2023-02-25"));
        assertEquals( "2023-02-25", students.getDateOfAdmission().toString());

    }

    @Test
    void testToString() {
    }
}