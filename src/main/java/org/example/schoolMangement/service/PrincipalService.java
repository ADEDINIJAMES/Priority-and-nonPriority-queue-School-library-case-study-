package org.example.schoolMangement.service;

import org.example.schoolMangement.Entity.Applicants;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;

public interface PrincipalService {

    void admit(Applicants applicant, Staff staffMember);

    void hire(Staff staff);
    void expel(Staff staff, Students students );
    void check_performance( Staff staff);


}
