package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.Entity.Courses;
import org.example.schoolMangement.Entity.Levels;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.enums.Course_title;
import org.example.schoolMangement.enums.Job;
import org.example.schoolMangement.enums.LevelName;
import org.example.schoolMangement.service.StudentService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentServiceImpl implements StudentService<Students, Courses> {
    Levels levels = new Levels();
    Students student = new Students();
    Courses courses = new Courses();

    @Override
    public void take_course(Students students, Courses courses) {
        if (students.getFirstName() != null) {
            Map<String, Course_title> listOfCoursesAndStudents = new HashMap<>();
            listOfCoursesAndStudents.put(students.getFirstName(), courses.getCourse_title());

            Iterator<Map.Entry<String, Course_title>> itr = listOfCoursesAndStudents.entrySet().iterator();

            while (itr.hasNext()) {
                Map.Entry<String, Course_title> entry = itr.next();
                System.out.println("Student_Name = " + entry.getKey() +
                        ", Course_Title = " + entry.getValue());

                System.out.println("  ");
                System.out.println(students.getFirstName() + " "+ students.getLastName()+ " "+" now takes this course");


            }
        }
    }

    @Override
    public void register(Staff staff, Students students, Levels levels) {
        if (students.getLastName() != null && staff.getJob() == Job.TEACHER  ) {
            Map<String, LevelName> listOfStudentsAndLevels = new HashMap<>();
            listOfStudentsAndLevels.put(students.getFirstName() + " "+ students.getLastName(), levels.getLevelName());

            Iterator<Map.Entry<String, LevelName>> itrl = listOfStudentsAndLevels.entrySet().iterator();

            while (itrl.hasNext()) {
                Map.Entry<String, LevelName> entry = itrl.next();
                System.out.println("Student_Name = " + entry.getKey() +
                        ", Class = " + entry.getValue()+ ",  Department=  "+ levels.getDepartment());

                System.out.println(students.getFirstName() + " "+ students.getLastName() + " Congratulations and Welcome to this new class!!  ");


            }

        }else {
            System.out.println("NOT YOUR JOB!!!");
        }
    }
}