package ru.mirea.java.practice3.zadanie1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWight(side);
    }

    @Override
    public void setWight(double side) {
        super.setWight(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
