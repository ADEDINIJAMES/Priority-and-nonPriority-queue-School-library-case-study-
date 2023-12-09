package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Applicants extends User {
    private Integer applicant_id;
    private BigDecimal applicant_fee;
    private String applicant_status;

    public Applicants(String name,  int age) {
        super(name, age);
    }

    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public BigDecimal getApplicant_fee() {
        return applicant_fee;
    }

    public void setApplicant_fee(BigDecimal applicant_fee) {
        this.applicant_fee = applicant_fee;
    }
    public String getApplicant_status() {
        return applicant_status;
    }

    public void setApplicant_status(String applicant_status) {
        this.applicant_status = applicant_status;
    }


    public Applicants(int applicant_id, BigDecimal applicant_fee, String applicant_status) {
        this.applicant_id = applicant_id;
        this.applicant_fee = applicant_fee;
        this.applicant_status = applicant_status;
    }

    public Applicants() {

    }


}