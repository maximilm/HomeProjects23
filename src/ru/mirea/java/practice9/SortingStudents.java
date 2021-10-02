package ru.mirea.java.practice9;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFIO().hashCode() - o2.getFIO().hashCode();
    }
}