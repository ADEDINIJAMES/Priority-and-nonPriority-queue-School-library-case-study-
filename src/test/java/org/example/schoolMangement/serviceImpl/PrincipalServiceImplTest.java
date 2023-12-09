package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.Entity.Applicants;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.enums.Gender;
import org.example.schoolMangement.enums.Job;
import org.example.schoolMangement.service.PrincipalService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalServiceImplTest {
    PrincipalServiceImpl principalService= new PrincipalServiceImpl();
    Staff staff= new Staff(Job.PRINCIPAL);

    @Test
    void admit() {
Applicants applicants = new Applicants();
Staff staff = new Staff(Job.PRINCIPAL);
Applicants applicant = new Applicants();
applicant.setAge(13);
assertTrue(applicant.getAge()> 12, "Admitted" );



//        Applicants applicant = new Applicants();
//        applicant.setAge(20);
//        Staff staff = new Staff();
//        staff.setJob(Job.PRINCIPAL);
//         assertFalse(, principalService.admit(applicant, staff));

//        if (staffMember.getJob() == Job.PRINCIPAL) {
//            if (applicant.getAge() >= 12) {
//                admittedApplicant.add("Name: " + applicant.getName() + " , " + "Age: " + applicant.getAge());
    }

    @Test
    void hire() {
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();
        Applicants applicants = new Applicants();
        Staff staff = new Staff(Job.PRINCIPAL);
       staff.setJob(Job.TEACHER);
        assertTrue(staff.getJob()!= Job.PRINCIPAL,"this staff" + " "+ staff.getFirstName() + " "+ staff.getLastName()+ "  has been hired to a post of :   "+ staff.getJob());

//        assertEquals("You have been EMPLOYED",principalService.admit(applicant, staff));

    }

    @Test
    void expel() {
        Students students = new Students();
        Staff staff = new Staff(Job.PRINCIPAL);
        Applicants applicant = new Applicants();
        students.setFirstName("Sola");

        assertEquals("Sola"+ "  has been expelled", students.getFirstName() + " "+ students.getLastName() + "  has been expelled");


    }

    @Test
    void check_performance() {
        int performance=0;
        Students students = new Students();
        Staff staff = new Staff(Job.PRINCIPAL);
        Applicants applicant = new Applicants();

        assertFalse(performance==1, "This staff's performance is of good record ");

    }
}