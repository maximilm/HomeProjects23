package ru.mirea.java.practice12;

public class Main {
    public static void main(String[] args) {
        Book one=  new Book("War and peace", 800,"Tolstoy");
        Book two=  new Book("Crime and Punishment", 400, "Dostoevski");
        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}

