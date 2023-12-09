package org.example.schoolMangement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String bookID;
    private String Author;
    private String bookTitle;
    private LocalDate datePublished;
    private int quantity;

}
