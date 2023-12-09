package org.example.schoolMangement;

import org.example.schoolMangement.DTO.LibraryDTO;
import org.example.schoolMangement.Entity.Book;
import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.Util.StudentUtil;
import org.example.schoolMangement.Util.TeacherUtil;
import org.example.schoolMangement.enums.Role;
import org.example.schoolMangement.serviceImpl.LibraryFunctionalImp;
import org.example.schoolMangement.serviceImpl.LibraryServiceImpl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;


import static org.example.schoolMangement.Util.StudentUtil.*;
import static org.example.schoolMangement.Util.TeacherUtil.people;
import static org.example.schoolMangement.Util.TeacherUtil.readTeacherFile;

public class  Main2 {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------STAFF LIST---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        readTeacherFile("src/main/java/org/example/schoolMangement/file/Dataset.csv");
        System.out.println("----------------------------------------------END OF STAFF LIST--------------------------------------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("  ");
        System.out.println("-------------------------------------------------STUDENT LIST-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
readStudentFile("src/main/java/org/example/schoolMangement/file/Dataset2.csv", "Teacher");
System.out.println("----------------------------------------------END OF STUDENT LIST----------------------------------------------------------------------------------------------------------------------------------------------------------");
        StudentUtil studentut = new StudentUtil();
        studentut.writeStudentFile("src/main/java/org/example/schoolMangement/file/studentfile.csv");
        TeacherUtil teacherUtil= new TeacherUtil();
        teacherUtil.writeExcelTeacher("src/main/java/org/example/schoolMangement/file/teacherfile.csv");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("-------------------------------------------------LIBRARY----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("  ");



        // ------------------------------------------------------------THIS FOR THE LIBRARY MANAGEMENT--------------------------------------------------------------
        LibraryServiceImpl libraryService= new LibraryServiceImpl();
        Book book1 = new Book();
        book1.setBookID("Bio101");
        book1.setBookTitle("In the valley of Knowledge");
        book1.setQuantity(3);
        book1.setAuthor("James Peter");
        book1.setDatePublished((LocalDate.of(2023, Month.OCTOBER,5)));
        Person staff= new Person();
        staff.setRole(Role.Libarian);
        Book book2= new Book("JAVA101","Adedini James","JAVA in the making",LocalDate.of(2023,Month.OCTOBER,5),3);
        Book book3= new Book("JAVA102","Adedini James","JAVAin in the making",LocalDate.of(2023,Month.OCTOBER,5),3);
        //---------------------- TO ADD BOOK------------------------------------------------------------
        System.out.println("--------------------------------BOOKS ADDED-----------------------------------------------------");
        LibraryFunctionalImp libraryFunctionalImp = new LibraryFunctionalImp();
//        libraryService.addBook(book1,staff);
//        libraryService.addBook(book2,staff);
        libraryFunctionalImp.AddBook.function(book1);
        libraryFunctionalImp.AddBook.function(book2);


        System.out.println("--------------------------------END OF LIST OF BOOKS ADDED-------------------------------------------");
        System.out.println(" ");

        // First Add User  ----------------------------------------------------
        Person libraryUser1= new Person();
            libraryUser1.setUserID(juniorStudent.get(1).getUserID());
            libraryUser1.setFirstName(juniorStudent.get(1).getFirstName());
            libraryUser1.setLastName(juniorStudent.get(1).getLastName());
            libraryUser1.setEmail(juniorStudent.get(1).getEmail());
            libraryUser1.setRole(juniorStudent.get(1).getRole());



        // Second Add User  ----------------------------------------------------
        Person libraryUser2= new Person();
            libraryUser2.setUserID(people.get(0).getUserID());
            libraryUser2.setFirstName(people.get(0).getFirstName());
            libraryUser2.setLastName(people.get(0).getLastName());
            libraryUser2.setEmail(people.get(0).getEmail());
            libraryUser2.setRole(people.get(0).getRole());



        // Third Add User ----------------------------------------------------
        Person libraryUser3= new Person();
        libraryUser3.setUserID(seniorStudent.get(2).getUserID());
        libraryUser3.setFirstName(seniorStudent.get(2).getFirstName());;
        libraryUser3.setLastName(seniorStudent.get(2).getLastName());
        libraryUser3.setEmail(seniorStudent.get(2).getEmail());
        libraryUser3.setRole(seniorStudent.get(2).getRole());


        // Fourth Add User ----------------------------------------------------
        Person libraryUser4= new Person();
        libraryUser4.setUserID(juniorStudent.get(3).getUserID());
        libraryUser4.setFirstName(juniorStudent.get(3).getFirstName());
        libraryUser4.setLastName(juniorStudent.get(3).getLastName());
        libraryUser4.setEmail(juniorStudent.get(3).getEmail());
        libraryUser4.setRole(juniorStudent.get(3).getRole());


        //  User's DTO Initialisation ----------------------------------------------------

        LibraryDTO libraryDTO1 =new LibraryDTO(libraryUser1.getUserID(), libraryUser1.getFirstName(), libraryUser1.getLastName(), libraryUser1.getRole(), book1,LocalDate.from(LocalDate.now().atStartOfDay().plusMonths((long)1)));
        LibraryDTO libraryDTO2 =new LibraryDTO(libraryUser2.getUserID(),libraryUser2.getFirstName(), libraryUser2.getLastName(), libraryUser2.getRole(), book1,LocalDate.from(LocalDate.now().atStartOfDay().plusMonths((long)1)));
        LibraryDTO libraryDTO3 =new LibraryDTO(libraryUser3.getUserID(),libraryUser3.getFirstName(), libraryUser3.getLastName(), libraryUser3.getRole(), book1,LocalDate.from(LocalDate.now().atStartOfDay().plusMonths((long)1)));
        LibraryDTO libraryDTO4 =new LibraryDTO(libraryUser4.getUserID(),libraryUser4.getFirstName(), libraryUser4.getLastName(), libraryUser4.getRole(), book1,LocalDate.from(LocalDate.now().atStartOfDay().plusMonths((long)1)));


        //Add User to Priority ----------------------------------------------------
        System.out.println("--------------------------------LEND BOOKS USING PRIORITIES(ADD TO QUEUE)--------------------------------------------");

//        libraryService.addUsersToQueue(book1,libraryUser1,libraryDTO1);
//        libraryService.addUsersToQueue(book1,libraryUser2,libraryDTO2);
//        libraryService.addUsersToQueue(book1,libraryUser3,libraryDTO3);
//        libraryService.addUsersToQueue(book1,libraryUser4,libraryDTO4);

        libraryFunctionalImp.addtoPriorityQueue.function(libraryUser1);
        libraryFunctionalImp.addtoPriorityQueue.function(libraryUser2);
        libraryFunctionalImp.addtoPriorityQueue.function(libraryUser3);
        libraryFunctionalImp.addtoPriorityQueue.function(libraryUser4);
        System.out.println(" ");

        ;
        System.out.println(" ");


          System.out.println("--------------------------------LEND BOOKS USING PRIORITIES------------------------------------------------");
//        libraryService.borrowWithPriorities(book1);
    //    libraryFunctionalImp.borrowUsingPriority.function(book2);

//
//        System.out.println("  ");
//
//
  System.out.println(" ");
      System.out.println("--------------------------------LEND BOOKS WITHOUT PRIORITIES(ADD TO QUEUE)--------------------------------------------");
//        libraryService.addUsersToQueueNoPriority(book1,libraryUser1,libraryDTO1);
//        libraryService.addUsersToQueueNoPriority(book1,libraryUser2,libraryDTO2);
//        libraryService.addUsersToQueueNoPriority(book1,libraryUser3,libraryDTO3);
//        libraryService.addUsersToQueueNoPriority(book1,libraryUser4,libraryDTO4);
//        System.out.println(" ");
      libraryFunctionalImp.addtoNonePriorityQueue.function(libraryUser1);
      libraryFunctionalImp.addtoNonePriorityQueue.function(libraryUser2);
      libraryFunctionalImp.addtoNonePriorityQueue.function(libraryUser3);
      libraryFunctionalImp.addtoNonePriorityQueue.function(libraryUser4);
        System.out.println(" ");
       System.out.println("--------------------------------LEND BOOKS WITHOUT PRIORITIES------------------------------------------------");
//        libraryService.borrowWithoutPriorities(book2);
        libraryFunctionalImp.borrowwithoutPriority.function(book1);

    }


}
