package org.example.schoolMangement.Util;

import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.enums.Role;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherUtil {
    public static List<Person> people = new ArrayList<>();

    public  static List<Person> readTeacherFile(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true; // Skip the header row
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 4 ) {
                    Person person = new Person();
                    person.setUserID(values[0]);
                    person.setEmail(values[1]);
                    person.setFirstName(values[2]);
                    person.setLastName(values[3]);
                    person.setRole(Role.Teacher);

                    people.add(person);

                }
             }
            for (Person pers : people) {
                System.out.println(pers);
                System.out.println("  ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }
    public void  writeExcelTeacher(String filepath) throws IOException {
        try{BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
            for(Person teach: people) {
                writer.write(teach.toString());
                writer.newLine();

            }

            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
