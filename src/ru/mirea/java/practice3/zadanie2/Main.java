package ru.mirea.java.practice3.zadanie2;


public class Main {
    public static void main(String[] args) {
        MovableRectangle one = new MovableRectangle(1,1,2,4, 6,6);
        System.out.print( one.toString());
        one.moveDown();
        System.out.print( one.toString());
        one.moveRight();
        System.out.print( one.toString());
        one.moveLeft();
        System.out.print( one.toString());
        one.moveUp();
        System.out.print( one.toString());
        MovableCircle two = new MovableCircle(1,1,4,4,5);
        System.out.print(two.toString());
        two.moveDown();
        System.out.print(two.toString());
        two.moveLeft();
        System.out.print(two.toString());
        two.moveRight();
        System.out.print(two.toString());
        two.moveUp();
        System.out.print(two.toString());

    }
}
