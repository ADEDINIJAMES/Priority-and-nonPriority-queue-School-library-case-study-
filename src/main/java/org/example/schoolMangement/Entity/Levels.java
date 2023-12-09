package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.Department;
import org.example.schoolMangement.enums.LevelName;

import java.util.List;
import java.util.Objects;

public class Levels {
    private LevelName levelName;
    private List<Students> students;
    private String classTeacherName;
    private Department department;

    public LevelName getLevelName() {
        return levelName;
    }

    public void setLevelName(LevelName levelName) {
        this.levelName = levelName;
    }

    public List<Students> getStudents() {
        return students;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public Levels() {
    }

    public Levels(LevelName levelName, List<Students> students, String classTeacherName, Department department) {
        this.levelName = levelName;
        this.students = students;
        this.classTeacherName = classTeacherName;
        this.department= department;
    }



    @Override
    public String toString() {
        return "Levels{" +
                "levelName=" + levelName +
                ", students=" + students +
                ", classTeacherName='" + classTeacherName + '\'' +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Levels levels)) return false;
        return levelName == levels.levelName && Objects.equals(students, levels.students) && Objects.equals(classTeacherName, levels.classTeacherName) && department == levels.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levelName, students, classTeacherName, department);
    }
}
