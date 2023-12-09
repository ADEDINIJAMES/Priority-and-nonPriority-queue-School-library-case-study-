package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.Entity.Applicants;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.enums.Job;
import org.example.schoolMangement.service.PrincipalService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PrincipalServiceImpl implements PrincipalService  {

    Students students = new Students();
    Applicants applicants= new Applicants();
    Staff staff = new Staff(Job.PRINCIPAL);
    List<Students>AllStudents= new ArrayList<>();

    List<String> admittedApplicant = new ArrayList<>();
    List< Students> student = new ArrayList<>();

    public static HashMap<Job, List<Staff>> staffList =  new HashMap<>();//hash map of staff list and their role

    @Override
    public void admit(Applicants applicant, Staff staffMember) {
        if (staffMember.getJob() == Job.PRINCIPAL) {
            if (applicant.getAge() >= 12) {
                admittedApplicant.add("Name: " + applicant.getFirstName() + " "+ applicant.getLastName() + " , " + "Age: " + applicant.getAge());
                System.out.println("Admitted");
                System.out.println(admittedApplicant);
            }
        } else if (applicant.getAge() < 12) {
            System.out.println("You should be at least 12 years old");

        } else {
            System.out.println("You are not allowed to admit anyboody");
        }
    }

            @Override
   public void hire(Staff staff) {
        if (staff.getJob()==null){
            throw new NullPointerException("ALERT GHOST WORKER!!! Role cannot be null");
        } else if (staff.getJob()!=Job.PRINCIPAL){
            if (staffList.get(staff.getJob()) == null) {
                List<Staff> staffL = new ArrayList<>();
                staffL.add(staff);
                staffList.put(staff.getJob(), staffL);
            } else {
                staffList.get(staff.getJob()).add(staff);
            }
            System.out.println("this staff" + " "+ staff.getFirstName() + " "+ staff.getLastName() + "  has been hired to a post of :   "+ staff.getJob());
        }else{
            throw new RuntimeException("VACANCY NOT AVAILABLE !!! CHOOSE RIGHT");
        }
    }
    @Override
    public void expel(Staff staff, Students students) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is student has committed a huge offence and deserves expulsion; " + "  " + "Please note that he/she is automatically removed from the list of student present in the School " +
                "Please enter true /false");
        Boolean ans = scanner.nextBoolean();
        if (staff.getJob() == Job.PRINCIPAL) {
            if (ans == true) {
                student.remove(students);
                System.out.println(students.getFirstName() + " "+ students.getLastName() + "  has been expelled");
                System.out.println(student);
            } else {
                System.out.println("HE HAS BEEN FORGIVEN !!");
            }
        }
    }
    @Override

    public void check_performance(Staff staff) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("HOW HAVE YOU SEEN THE PERFORMANCE OF   "+ staff.getFirstName() + " "+ staff.getLastName() + "  as a  "+ staff.getJob());
        System.out.println("IF GOOD PICK '1', ON PROBATION '2', IF BAD WRITE '3'");
        int performance = scanner.nextInt();
        if (performance== 1) {
            System.out.println("This staff's performance is of good record ");
        }else if(performance==2){
            System.out.println("Improve or we fire you!!");
        }else if (performance==3){
            System.out.println("YOU ARE FIRED !!!");
        }else {
            System.out.println("Pick correct options !!");
        }

    }

    public List<String> getadmittedApplicant() {
    return admittedApplicant;}
}
