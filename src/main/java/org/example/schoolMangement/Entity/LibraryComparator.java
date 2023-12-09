package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Role;

import java.util.Comparator;

public class LibraryComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if(person2.getRole().ordinal() > person1.getRole().ordinal()){
            return 1;
        }else if(person2.getRole().ordinal() < person1.getRole().ordinal() ) {

            return -1;
        }
            return 0;
        }

    }

