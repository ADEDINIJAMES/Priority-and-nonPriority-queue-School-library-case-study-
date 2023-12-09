package org.example.schoolMangement.service;

import org.example.schoolMangement.Entity.Courses;
import org.example.schoolMangement.Entity.Levels;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;

import java.util.logging.Level;

public interface StudentService<S,C> {
    void take_course(S s, C c);


    void register(Staff  staff, Students students, Levels level);
}
