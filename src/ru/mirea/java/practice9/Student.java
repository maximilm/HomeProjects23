
package ru.mirea.java.practice9;

public class Student {
    private String name;
    private String inn;

    public Student(String name, String inn){
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
