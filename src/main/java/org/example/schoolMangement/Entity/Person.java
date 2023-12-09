package org.example.schoolMangement.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.example.schoolMangement.enums.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Data
public class Person {
    //----------------------------Fields for Users-----------------------------
    private String userID;
    private String firstName;
    private String lastName;
    private String email;
    private Integer grade;
    private Role role;
    private String guardianEmail1;
    private  String guardianEmail2;
    private String isAchive;
    private String isDeleted;
    private  String address;
    private Gender gender;
    private LocalDate dateOfbirth;
    private long phoneNumber;


  //  --------------------------------------STAFF-----------------------------------

    private MaritalStatus maritalStatus;
    private LocalDate appointment;
    private LocalDate dateOfLastPromotion;
    private String stateOfOrigin;
    private Job job;
    private BigDecimal salary;
    public List<Staff> staffList;
    //--------------------------------------------------STUDENTS------------------------------------------
    private String guardianName;
    private  Long guardianPhone;

    private LevelName level;
    private Department department;
    private int  noOfCourses;
    private Terms semester;
    private Category category;
    private BigDecimal payment;
    private LocalDate dateOfAdmission;
    private List<Courses> courses;

    @Override
    public String toString() {
        return "Person{" +
                "userID='" + userID + '\'' +
                "| firstName='" + firstName + '\'' +
                "| lastName='" + lastName + '\'' +
                "| email='" + email + '\'' +
                "| role=" + role +
                '}';
    }
}
