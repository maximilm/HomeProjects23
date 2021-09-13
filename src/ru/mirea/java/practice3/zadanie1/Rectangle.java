package ru.mirea.java.practice3.zadanie1;

public class Rectangle extends Shape{
    protected double wight;
    protected double length;
    @Override
    public double getArea() {
        return wight*length;
    }

    @Override
    public double getPerimeter() {
        return (2*wight+2*length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "wight=" + wight +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Rectangle() {

    }
    public Rectangle(double wight, double length) {
        this.wight = wight;
        this.length = length;
    }

    public Rectangle(double wight, double length,String color, boolean filled ) {
        super(color, filled);
        this.wight = wight;
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public double getLength() {
        return length;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
