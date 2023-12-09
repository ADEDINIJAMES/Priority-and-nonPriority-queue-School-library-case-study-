package org.example.schoolMangement.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.schoolMangement.enums.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data

public class Students extends User {

    public static List<Students> listOfstudent = new ArrayList<>();
    private int studentID;
    private String guardianName;
    private  Long guardianPhone;
    private String guardianEmail1;
    private  String guardianEmail2;
    private LevelName level;
    private Department department;
    private int  noOfCourses;
    private Terms semester;
    private int grade;
    private Category category;
    private BigDecimal payment;
    private LocalDate dateOfAdmission;
    private List<Courses> courses;
}
