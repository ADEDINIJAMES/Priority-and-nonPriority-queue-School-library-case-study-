package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.DTO.LibraryDTO;
import org.example.schoolMangement.Entity.Book;
import org.example.schoolMangement.Entity.LibraryComparator;
import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.enums.Role;
import org.example.schoolMangement.service.LibraryService;

import java.util.*;


public class LibraryServiceImpl implements LibraryService<Book,Person,LibraryDTO> {
    private  static List<Book> bookslist = new ArrayList<>();
    private  static List<LibraryDTO> libraryUserDTOs = new ArrayList<>();
    public   static Queue<Person> borrowWithPriority = new PriorityQueue<>(new LibraryComparator());
    private  static Queue<Person> borrowWithoutPriority = new LinkedList<>();
    @Override
    public List<Book> addBook(Book book, Person person) {
        if (book != null) {

            bookslist.add(book);
            System.out.println(book);
            System.out.println("Book added succesfully");
        } else{
            System.out.println("cannot be processed");
        }


        return bookslist;
    }

    @Override
    public Queue<Person> addUsersToQueue(Book book, Person libraryUser, LibraryDTO libraryUserDTO) {
//        borrowWithPriority.add(people.get(1));
//        borrowWithPriority.add(seniorStudent.get(2));
//        borrowWithPriority.add(juniorStudent.get(0));
//        borrowWithPriority.add(people.get(0));
//        borrowWithPriority.add(seniorStudent.get(2));
//        borrowWithPriority.add(juniorStudent.get(1));
        borrowWithPriority.add(libraryUser);
        libraryUserDTOs.add(libraryUserDTO);
       // System.out.println(borrowWithPriority);
        System.out.println("  ");
        //System.out.println(libraryUserDTOs);
for(Person element : borrowWithPriority){
    System.out.println();
    System.out.println(element);
}
System.out.println();
//
//
   for(LibraryDTO object : libraryUserDTOs){
         System.out.println(object);
          System.out.println();
        }

        return borrowWithPriority;
    }


    @Override
    public void borrowWithPriorities(Book book) throws Exception {

           while (!borrowWithPriority.isEmpty()&& !bookslist.isEmpty()) {
               if (borrowWithPriority.peek().getRole() == Role.Teacher || borrowWithPriority.peek().getRole() == Role.Student_Junior || borrowWithPriority.peek().getRole() == Role.Student_Senior) {

                   if (!bookslist.contains(book)) {
                       System.out.println("THIS BOOK IS NOT AVAILABLE");
                       break;
               } else {

                       if (book.getQuantity()==0) {
                           System.out.println(book.getBookTitle() + "  NO MORE AVAILABLE!!!");
                           break;
                       }
                       System.out.println(borrowWithPriority.peek().getFirstName() + " a  " + borrowWithPriority.peek().getRole() + " " + "gets a copy of,  "+ book.getBookTitle() );
                       book.setQuantity(book.getQuantity() - 1);
                       System.out.println(book);
                       borrowWithPriority.poll();
                       System.out.println(" ");
                       System.out.println(" ");
                   }
               } else {
                   throw new Exception("YOU DON'T HAVE A ROLE!!!");
               }
           }


    }

    @Override
    public void addUsersToQueueNoPriority(Book book, Person libraryUser, LibraryDTO libraryUserDTO) {
        borrowWithoutPriority.add(libraryUser);
        for(Person element : borrowWithoutPriority){
            System.out.println();
            System.out.println(element);
        }
        System.out.println("  ");


    }

    @Override
    public void borrowWithoutPriorities(Book book) {
        try {

            while (!borrowWithoutPriority.isEmpty() && !bookslist.isEmpty()) {

                if (borrowWithoutPriority.peek().getRole() == Role.Teacher || borrowWithoutPriority.peek().getRole() == Role.Student_Junior || borrowWithoutPriority.peek().getRole() == Role.Student_Senior) {
                    if (!bookslist.contains(book)) {

                        System.out.println("THIS BOOK IS NOT AVAILABLE");

                        break;
                    } else {
                        if (book.getQuantity() == 0) {
                            System.out.println(book.getBookTitle() + "  NO MORE AVAILABLE!!!");
                            break;
                        }
                        System.out.println(borrowWithoutPriority.peek().getFirstName() + " a  " + borrowWithoutPriority.peek().getRole() + " " + "gets a copy of,  " + book.getBookTitle());
                        book.setQuantity(book.getQuantity() - 1);
                        System.out.println(book);
                        borrowWithoutPriority.poll();
                        System.out.println(" ");

                        System.out.println(" ");




                    }
                } else {
                    throw new Exception("YOU DON'T HAVE A ROLE!!!");
                }
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }


    }
}






