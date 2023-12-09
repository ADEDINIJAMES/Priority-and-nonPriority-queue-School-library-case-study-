package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Department;
import org.example.schoolMangement.enums.LevelName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelsTest {

    @Test
    void getLevelName() {
        Levels levels = new Levels();
        levels.setLevelName(LevelName.SSS_1);
        assertEquals(LevelName.SSS_1, levels.getLevelName());

    }

    @Test
    void setLevelName() {
        Levels levels = new Levels();
        levels.setLevelName(LevelName.SSS_1);
        assertEquals(LevelName.SSS_1, levels.getLevelName());

    }

    @Test
    void getDepartment() {
        Levels levels = new Levels();
        levels.setDepartment(Department.SCIENCE);
        assertEquals(Department.SCIENCE, levels.getDepartment());
    }

    @Test
    void setDepartment() {
        Levels levels = new Levels();
        levels.setDepartment(Department.COMMERCIAL);
        assertEquals(Department.COMMERCIAL, levels.getDepartment());

    }


    @Test
    void getClassTeacherName() {
        Levels levels = new Levels();
        levels.setClassTeacherName("Olanipekun");
        assertEquals("Olanipekun", levels.getClassTeacherName());
    }

    @Test
    void setClassTeacherName() {
        Levels levels = new Levels();
        levels.setClassTeacherName("Sola");
        assertEquals("Sola", levels.getClassTeacherName());
    }
}