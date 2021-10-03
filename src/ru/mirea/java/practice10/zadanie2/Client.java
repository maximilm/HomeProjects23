package ru.mirea.java.practice10.zadanie2;

import ru.mirea.java.practice10.zadanie2.Chair.Chair;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Sitting");
    }

    public Client() {
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
