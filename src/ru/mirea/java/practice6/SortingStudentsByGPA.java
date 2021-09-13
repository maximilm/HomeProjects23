package ru.mirea.java.practice6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
       return -(a.getBal() - b.getBal());
    }
}
