package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Job;
import org.example.schoolMangement.enums.MaritalStatus;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getStaffList() {
        Staff staff = new Staff(Job.PRINCIPAL);
        List<Staff> staffList= new ArrayList<>();
        staffList.add(staff);
        staffList.add(staff);
        assertEquals(2, staffList.size());    }

    @Test
    void setStaffList() {
        Students students= new Students();
        List<Students> studentsList= new ArrayList<>();
        studentsList.add(students);
        studentsList.remove(students);
        assertEquals(0, studentsList.size());
    }

    @Test
    void getJob() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setJob(Job.TEACHER);
        assertEquals(Job.TEACHER, staff.getJob());
    }

    @Test
    void setJob() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setJob(Job.PRINCIPAL);
        assertEquals(Job.PRINCIPAL, staff.getJob());
    }

    @Test
    void getSalary() {
        BigDecimal big = new BigDecimal(500000);
        Staff staff= new Staff(Job.PRINCIPAL);
        staff.setSalary(big);
        assertEquals(big, staff.getSalary());

    }

    @Test
    void setSalary() {
        BigDecimal sal = new BigDecimal(500000);
        Staff staff= new Staff(Job.PRINCIPAL);
        staff.setSalary(sal);
        assertEquals(sal, staff.getSalary());
    }

    @Test
    void getGrade() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setGrade(50);
        assertEquals(50, staff.getGrade());

    }

    @Test
    void setGrade() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setGrade(100);
        assertEquals(100, staff.getGrade());
    }

    @Test
    void getMaritalStatusTest() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setMaritalStatus(MaritalStatus.Single);
        assertEquals(MaritalStatus.Single, staff.getMaritalStatus());
    }

    @Test
    void setMaritalStatusTest() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setMaritalStatus(MaritalStatus.Married);
        assertEquals(MaritalStatus.Married, staff.getMaritalStatus());

    }

    @Test
    void getAppointmentTest() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setAppointment(LocalDate.parse("2023-04-19"));
        assertEquals("2023-04-19", staff.getAppointment().toString());

    }

    @Test
    void setAppointment() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setAppointment(LocalDate.parse("2023-04-19"));
        assertEquals(LocalDate.parse("2023-04-19"),staff.getAppointment());

    }

    @Test
    void getDateOfLastPromotion() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setDateOfLastPromotion(LocalDate.parse("2023-04-20"));
        assertEquals(LocalDate.parse("2023-04-20"),staff.getDateOfLastPromotion());

    }

    @Test
    void setDateOfLastPromotion() {
        Staff staff = new Staff(Job.PRINCIPAL);
        staff.setDateOfLastPromotion(LocalDate.parse("2024-09-28"));
        assertEquals("2024-09-28", staff.getDateOfLastPromotion().toString());
    }
}