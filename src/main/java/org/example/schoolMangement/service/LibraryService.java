package org.example.schoolMangement.service;

import org.example.schoolMangement.DTO.LibraryDTO;
import org.example.schoolMangement.Entity.Book;
import org.example.schoolMangement.Entity.Person;

import java.util.List;
import java.util.Queue;

public interface LibraryService<B,P,D> {
    List<Book> addBook(B book, P person);
    Queue<Person> addUsersToQueue(B book, P libraryUser, LibraryDTO libraryUserDTO);

    void borrowWithPriorities(B book) throws Exception;
    void  addUsersToQueueNoPriority(B book, P libraryUser, D libraryUserDTO);


    void borrowWithoutPriorities(B book);

}
