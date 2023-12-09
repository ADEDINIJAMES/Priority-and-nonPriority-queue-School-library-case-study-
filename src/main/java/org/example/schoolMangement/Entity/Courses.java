package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Course_title;
import org.example.schoolMangement.enums.Department;

public class Courses {
private static Course_title course_title;
private Department department;
private String course_teacher;
private Integer enrolledStudents;

    public Integer getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents (Integer enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Course_title getCourse_title() {
        return course_title;
    }

    public  void setCourse_title(Course_title course_title) {
        Courses.course_title = course_title;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(String course_teacher) {
        this.course_teacher = course_teacher;
    }


    @Override
    public String toString() {
        return "Courses{" +
                "course_title='" + course_title + '\'' +
                ", department='" + department + '\'' +
                ", course_teacher='" + course_teacher + '\'' +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    public Courses() {
    }

    public Courses(Course_title course_title, Department department, String course_teacher, Integer enrolledStudents) {
        this.course_title = course_title;
        this.department = department;
        this.course_teacher = course_teacher;
        this.enrolledStudents = enrolledStudents;
    }





    }

