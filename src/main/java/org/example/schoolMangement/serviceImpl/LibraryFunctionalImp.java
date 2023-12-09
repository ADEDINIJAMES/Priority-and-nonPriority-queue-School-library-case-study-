package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.DTO.LibraryDTO;
import org.example.schoolMangement.Entity.Book;
import org.example.schoolMangement.Entity.LibraryComparator;
import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.exceptions.BookNotFoundException;
import org.example.schoolMangement.enums.Role;
import org.example.schoolMangement.exceptions.NoRoleException;
import org.example.schoolMangement.service.LibraryImplUsingFunctionalIn;

import java.util.*;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public  class LibraryFunctionalImp {
    private static List<Book> bookslist = new ArrayList<>();
    private Logger logger = Logger.getGlobal();
    private static List<LibraryDTO> libraryUserDTOs = new ArrayList<>();
    public static Queue<Person> borrowWithPriority = new PriorityQueue<>(new LibraryComparator());
    private static Queue<Person> borrowWithoutPriority = new LinkedList<>();

    public LibraryImplUsingFunctionalIn<Book> AddBook= book -> {
        if (book != null) {

            bookslist.add(book);
            bookslist.forEach(System.out::println);
            logger.info ("Book added succesfully");
        } else{
            throw new BookNotFoundException("cannot be processed");
        }


    };

    public LibraryImplUsingFunctionalIn<Person>addtoPriorityQueue= person -> {
        borrowWithPriority.add(person);
        System.out.println("  ");
        System.out.println( borrowWithPriority);




    };

    public LibraryImplUsingFunctionalIn<Person>addtoNonePriorityQueue= person -> {
        borrowWithoutPriority.add(person);
        System.out.println( borrowWithoutPriority);

        System.out.println("  ");

    };
    public LibraryImplUsingFunctionalIn<Book> borrowUsingPriority = book -> {
        while (!borrowWithPriority.isEmpty() && !bookslist.isEmpty()) {

            if (borrowWithPriority.peek().getRole() == Role.Teacher || borrowWithPriority.peek().getRole() == Role.Student_Junior || borrowWithPriority.peek().getRole() == Role.Student_Senior) {
                if (!bookslist.contains(book)) {

                    throw new BookNotFoundException ("THIS BOOK IS NOT AVAILABLE");


                } else {
                    if (book.getQuantity() == 0) {
                        throw new BookNotFoundException(book.getBookTitle() + "  NO MORE AVAILABLE!!!");

                    }
                    logger.info(borrowWithPriority.peek().getFirstName() + " a  " + borrowWithPriority.peek().getRole() + " " + "gets a copy of,  " + book.getBookTitle());
                    book.setQuantity(book.getQuantity() - 1);
                    logger.info(book.getBookTitle()+ ",  by  "+book.getAuthor()+ " remains"+ " "+ book.getQuantity() );
                    borrowWithPriority.poll();
                    System.out.println(" ");

                    System.out.println(" ");


                }
            } else {
                throw  new NoRoleException("YOU DON'T HAVE A ROLE!!!");
            }


        }



    };
    public LibraryImplUsingFunctionalIn<Book> borrowwithoutPriority = book -> {
        while (!borrowWithoutPriority.isEmpty() && !bookslist.isEmpty()) {

            if (borrowWithoutPriority.peek().getRole() == Role.Teacher || borrowWithoutPriority.peek().getRole() == Role.Student_Junior || borrowWithoutPriority.peek().getRole() == Role.Student_Senior) {
                if (!bookslist.contains(book)) {

                   throw new BookNotFoundException ("THIS BOOK IS NOT AVAILABLE");


                } else {
                    if (book.getQuantity() == 0) {
                        throw new BookNotFoundException(book.getBookTitle() + "  NO MORE AVAILABLE!!!");

                    }
                    logger.info(borrowWithoutPriority.peek().getFirstName() + " a  " + borrowWithoutPriority.peek().getRole() + " " + "gets a copy of,  " + book.getBookTitle());
                    book.setQuantity(book.getQuantity() - 1);
                    logger.info(book.getBookTitle()+ ",  by  "+book.getAuthor()+ " remains"+ " "+ book.getQuantity() );
                    borrowWithoutPriority.poll();
                    System.out.println(" ");

                    System.out.println(" ");


                }
            } else {
                throw  new NoRoleException("YOU DON'T HAVE A ROLE!!!");
            }


        }

    };

}
