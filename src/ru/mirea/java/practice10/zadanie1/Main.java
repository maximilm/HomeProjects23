package ru.mirea.java.practice10.zadanie1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory n = new ConcreteFactory();
        Complex com = n.createComplex();
        Complex com2 = n.createComplex(5,6);
        System.out.println(com.toString());
        System.out.println(com2.toString());
    }
}
