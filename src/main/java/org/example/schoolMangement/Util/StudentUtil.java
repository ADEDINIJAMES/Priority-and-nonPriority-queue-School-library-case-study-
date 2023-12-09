package org.example.schoolMangement.Util;

import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.enums.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
   public static List<Person> student = new ArrayList<>();
   public static List<Person> seniorStudent = new ArrayList<>();
   public static List<Person> juniorStudent = new ArrayList<>();
    public static List<Person> readStudentFile(String pathname, String sheetName) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathname))) {
            String read;
            boolean firstline = true;
            while ((read = bufferedReader.readLine()) != null) {
                if (firstline) {
                    firstline = false;
                    continue;
                }
                String[] std = read.split(",", -1);
                for (int i = 0; i < std.length; i++) {
                    if (std[i].isBlank()) {
                        std[i] = null;
                    }
                }
                if (std.length == 9) {
                    Person students = new Person();
                    students.setUserID(std[0].trim());
                    students.setFirstName(std[1].trim());
                    students.setLastName(std[2].trim());
                    students.setGrade(Integer.parseInt(std[3].trim()));
                    students.setEmail(std[4].trim());
                    students.setGuardianEmail1(std[5].trim());
                    students.setGuardianEmail2(std[6].trim());
                    students.setIsAchive(std[7]);
                    students.setIsDeleted(std[8]);
                    if(students.getGrade()<=2){
                        students.setRole(Role.Student_Junior);
                        juniorStudent.add(students);
                    }else {
                        students.setRole(Role.Student_Senior);
                        seniorStudent.add(students);
                    }

                    student.add(students);



                }

            }
            for (Person stud : student) {
                System.out.println(stud);
                System.out.println("  ");


            }
            System.out.println("JUNIOR!!");
            for (Person fil : juniorStudent) {
                System.out.println(fil);
                System.out.println("  ");

            }
            System.out.println("SENIOR!!");
            for (Person field : seniorStudent) {
                System.out.println(field);
                System.out.println("  ");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }



    public void  writeStudentFile(String filepath) throws IOException {
        try{BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
            for(Person stu: student) {
                writer.write(stu.toString());
                writer.newLine();

            }

            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }






}
}
