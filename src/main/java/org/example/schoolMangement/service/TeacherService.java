package org.example.schoolMangement.service;

import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.Entity.Courses;

public interface TeacherService<S,St, C> {
    void record_performance (S s, St st);
    void  teach(S s, C c);


}
