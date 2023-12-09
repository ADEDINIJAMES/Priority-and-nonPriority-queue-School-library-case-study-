package org.example.schoolMangement.Entity;


import org.example.schoolMangement.enums.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Staff extends User{
 private String staffID;

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    private Integer grade;
    private MaritalStatus maritalStatus;
    private LocalDate appointment;
    private LocalDate dateOfLastPromotion;
    private String stateOfOrigin;
    private Job job;
    private BigDecimal salary;
    public List<Staff> staffList;

    public List<Staff> getStaffList() {
        return staffList;
    }
    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public LocalDate getAppointment() {
        return appointment;
    }

    public void setAppointment(LocalDate appointment) {
        this.appointment = appointment;
    }

    public LocalDate getDateOfLastPromotion() {
        return dateOfLastPromotion;
    }

    public void setDateOfLastPromotion(LocalDate dateOfLastPromotion) {
        this. dateOfLastPromotion = dateOfLastPromotion;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public Staff(Job principal) {
   }

//    public Staff(String name, int phoneNumber, String address, String email, Gender gender, LocalDate dateOfbirth, int age, String stateOfOrigin, String localGovernmentOforigin, String nextOfKin, long next_Of_kin_phone, org.example.schoolMangement.enums.BloodGroup bloodGroup, Genotype genotype, String underlying_Ailment, Job job, BigDecimal salary, Integer grade, Marital_Status marital_status, LocalDate appointment, LocalDate date_Of_Last_Promotion, String state_Of_Origin1, List<Students> student, List<Staff> teachers) {
//        super(name, phoneNumber, address, email, gender, dateOfbirth, age, stateOfOrigin, localGovernmentOforigin, nextOfKin, nextOfkinphone, bloodGroup, genotype, underlyingAilment);
//        this.job = job;
//        this.salary = salary;
//        this.grade = grade;
//        this.maritalStatus = maritalStatus;
//        this.appointment = appointment;
//        this.dateOfLastPromotion = dateOfLastPromotion;
//        this.stateOfOrigin = stateOfOrigin1;
//        this.listOfstudent= student;
//        this.teachers = teachers;
//    }



//    public static void main(String[] args) {
//        Staff staff = new Staff();;
//    }



    @Override
    public String toString() {
        return "Staff{" +

                "job=" + job +
                "staffID=" + staffID+
                ", salary=" + (char) 8358+ salary +
                ", grade='" + grade + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", appointment=" + appointment +
                ", dateOfLastPromotion=" + dateOfLastPromotion +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff staff)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(grade, staff.grade)&& Objects.equals(staffID, staff.staffID) && maritalStatus == staff.maritalStatus && Objects.equals(appointment, staff.appointment) && Objects.equals(dateOfLastPromotion, staff.dateOfLastPromotion) && Objects.equals(stateOfOrigin, staff.stateOfOrigin) && job == staff.job && Objects.equals(salary, staff.salary) && Objects.equals(staffList, staff.staffList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade, maritalStatus, appointment, dateOfLastPromotion, stateOfOrigin, job, salary, staffList);
    }
}
