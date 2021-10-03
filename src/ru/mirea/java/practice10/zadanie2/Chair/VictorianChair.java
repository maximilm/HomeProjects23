package ru.mirea.java.practice10.zadanie2.Chair;

import ru.mirea.java.practice10.zadanie2.Chair.Chair;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    public VictorianChair() {
    }

    public void setAge(int age) {
        this.age = age;
    }
}
