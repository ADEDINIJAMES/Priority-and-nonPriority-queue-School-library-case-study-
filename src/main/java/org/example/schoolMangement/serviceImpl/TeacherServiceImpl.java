package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.Entity.Courses;
import org.example.schoolMangement.enums.Course_title;
import org.example.schoolMangement.enums.Department;
import org.example.schoolMangement.enums.Job;
import org.example.schoolMangement.service.TeacherService;

import java.util.*;

public class TeacherServiceImpl  implements TeacherService<Staff, Students, Courses> {
    Courses courses = new Courses();
    Students students= new Students();
    @Override
    public void record_performance(Staff staff, Students student) {
        if (staff.getJob()  == Job.TEACHER) {
            if (student.getGrade() >= 70 && student.getGrade() <= 100) {
                System.out.println("A");
            } else if (student.getGrade() >= 60 && student.getGrade() <= 69) {

            }
            else if (student.getGrade() >= 50 && student.getGrade() <= 59) {
                System.out.println("C");
            }
            else if (student.getGrade() >= 40 && student.getGrade() <= 49) {
                System.out.println("D");
            }
            else if (student.getGrade() >= 30 && student.getGrade() <= 0) {
                System.out.println("F");
            }else {

            System.out.println(" the teacher records the performance of the Students");
        }
        }else{
            System.out.println("IT IS NOT YOUR JOB !!!");
        }

    }


    @Override
    public void teach(Staff staff, Courses courses) {
        if (staff.getJob()  == Job.TEACHER) {
            Map<Course_title, Department> listOfcoursesInDepartment = new HashMap<>();
            listOfcoursesInDepartment.put(courses.getCourse_title(), courses.getDepartment());
            Map<Course_title, String> listOfcoursesandTeachers = new HashMap<>();
            listOfcoursesandTeachers.put(courses.getCourse_title(), courses.getCourse_teacher());
            Map<Course_title, Integer> listOfcoursesAndEnrolledStudent = new HashMap<>();
            listOfcoursesAndEnrolledStudent.put(courses.getCourse_title(), courses.getEnrolledStudents());

            Iterator<Map.Entry<Course_title, Department>> itr = listOfcoursesInDepartment.entrySet().iterator();

            while (itr.hasNext()) {
                Map.Entry<Course_title, Department> entry = itr.next();
                System.out.println("Course_title = " + entry.getKey() +
                        ", Department = " + entry.getValue());
            }
            System.out.println("   ");
            Iterator<Map.Entry<Course_title, String>> itr2 = listOfcoursesandTeachers.entrySet().iterator();
            while (itr2.hasNext()) {
                Map.Entry<Course_title, String> entry = itr2.next();
                System.out.println("Course_title = " + entry.getKey() +
                        ", Teachers = " + entry.getValue());
            }
            System.out.println("   ");

            Iterator<Map.Entry<Course_title, Integer>> itr3 = listOfcoursesAndEnrolledStudent.entrySet().iterator();

            while (itr3.hasNext()) {
                Map.Entry<Course_title, Integer> entry = itr3.next();
                System.out.println("Course_title = " + entry.getKey() +
                        ", No_Of_Student_Enrolled = " + entry.getValue());
            }

        }



    }
}



//    @Override
//    public void teach(Staff staff,Courses courses) {
//        System.out.println(staff.getName()+ " "+ "teaches Students"+ " "+ courses);


