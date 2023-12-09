package org.example.schoolMangement.DTO;

import lombok.Data;
import org.example.schoolMangement.Entity.Book;
import org.example.schoolMangement.Entity.Person;
import org.example.schoolMangement.enums.Role;

import java.time.LocalDate;

@Data
public class LibraryDTO {
    private String userID;
    private String firstName;
    private String lastName;
    private Book book;
    private Role role;
    private LocalDate expiryDate;

    public LibraryDTO(String userID,String firstName, String lastName, Role role, Book book, LocalDate expiryDate) {
        this.userID = userID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.book = book;
        this.role = role;
        this.expiryDate=expiryDate;


    }

    @Override
    public String toString() {
        return "LibraryDTO{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", book=" + book +
                ", role=" + role +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
