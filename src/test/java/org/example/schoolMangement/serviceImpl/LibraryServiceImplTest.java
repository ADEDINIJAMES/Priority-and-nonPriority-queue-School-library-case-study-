package org.example.schoolMangement.serviceImpl;

import org.example.schoolMangement.DTO.LibraryDTO;
import org.example.schoolMangement.Entity.Book;
import org.example.schoolMangement.Entity.LibraryComparator;
import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.enums.Role;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Supplier;

import static org.example.schoolMangement.Util.TeacherUtil.people;
import static org.example.schoolMangement.serviceImpl.LibraryServiceImpl.borrowWithPriority;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    private static Queue<Person> borrowWithPriority = new PriorityQueue<>(new LibraryComparator());
    Book book1 = new Book("23", "James", "Life at Decagon", LocalDate.of(2023, Month.OCTOBER, 5), 3);

    @Test
    void addBookTest1() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        Person staff = new Person();
        List<Book> bookList = libraryService.addBook(book1, staff);
        libraryService.addBook(book1, staff);
        assertTrue(bookList.contains(book1));
    }


    @Test
    void addUsersToQueueTest() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Book book1 = new Book("23", "James", "Life at Decagon", LocalDate.of(2023, Month.OCTOBER, 5), 3);
        Person person = new Person();
        person.setFirstName("James");
        person.setLastName("Adedini");
        person.setRole(Role.Student_Junior);
        person.setUserID("1");
        LibraryDTO libraryDTO1 = new LibraryDTO(person.getUserID(), person.getFirstName(), person.getLastName(), person.getRole(), book1, LocalDate.from(LocalDate.now().atStartOfDay().plusMonths((long) 1)));

        Queue<Person> borrowWithPriority = libraryService.addUsersToQueue(book1, person, libraryDTO1);
        assertTrue(borrowWithPriority.contains(person));
    }

    @Test
    void borrowWithPriorities() throws Exception {

        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Book book2 = new Book("23", "James", "Life at Decagon", LocalDate.of(2023, Month.OCTOBER, 5), 0);

        libraryService.borrowWithPriorities(book2);

        assertTrue(book2.getQuantity() == 0, "All COPIES TAKEN ALREADY");
    }

    @Test
    void addUsersToQueueNoPriority() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Book book3 = new Book("23", "James", "Life at Decagon, 2023", LocalDate.of(2023, Month.OCTOBER, 5), 3);
        Person person = new Person();
        person.setFirstName("James");
        person.setLastName("Adedini");
        person.setRole(Role.Student_Senior);
        person.setUserID("2");
        LibraryDTO libraryDTO2 = new LibraryDTO(person.getUserID(), person.getFirstName(), person.getLastName(), person.getRole(), book3, LocalDate.from(LocalDate.now().atStartOfDay().plusMonths((long) 1)));

        Queue<Person> borrowWithoutPriority = libraryService.addUsersToQueue(book3, person, libraryDTO2);
        assertFalse(!borrowWithoutPriority.contains(person));
    }

    @Test
    void borrowWithoutPriorities() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Book book3 = new Book("23", "James", "Life at Decagon, 2023", LocalDate.of(2023, Month.OCTOBER, 5), 0);

        libraryService.borrowWithoutPriorities(book3);

        assertTrue(book3.getQuantity() == 0, "All COPIES TAKEN ALREADY");
    }

    @Test
    void borrowWithoutPriorities2() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        Book book3 = new Book("23", "James", "Life at Decagon, 2023", LocalDate.of(2023, Month.OCTOBER, 5), 0);

        libraryService.borrowWithoutPriorities(book3);

        assertFalse(book3.getQuantity() != 0, "All COPIES TAKEN ALREADY");
    }
}