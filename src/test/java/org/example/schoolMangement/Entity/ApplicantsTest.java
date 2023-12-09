package org.example.schoolMangement.Entity;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantsTest {

    @Test
    void  getApplicant_idTest() {
        Applicants applicants = new Applicants();
        applicants.setApplicant_id(15);
        assertEquals(15, applicants.getApplicant_id());

    }



    @Test
    void setApplicant_idTest() {
        Applicants applicants= new Applicants();
  applicants.setApplicant_id(1);
  assertEquals( 1, applicants.getApplicant_id());

    }


    @Test
    void getApplicant_feeTest() {
        Applicants applicants = new Applicants();
BigDecimal big= new BigDecimal(50000);
    applicants.setApplicant_fee(big);
    assertEquals(big, applicants.getApplicant_fee());

    }

    @Test
    void setApplicant_feeTest() {
        Applicants applicants = new Applicants();
        BigDecimal b = new BigDecimal(5000);
applicants.setApplicant_fee(b);
assertEquals(b, applicants.getApplicant_fee());

    }

    @Test
    void getApplicant_statusTest() {
        Applicants applicants = new Applicants();
        applicants.setApplicant_status("Good");
        assertEquals("Good", applicants.getApplicant_status());

    }

    @Test
    void setApplicant_statusTest() {
        Applicants applicants = new Applicants();
        applicants.setApplicant_status("Admitted");
        assertEquals("Admitted", applicants.getApplicant_status());

    }
}