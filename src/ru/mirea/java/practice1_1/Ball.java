package ru.mirea.java.practice1_1;

public class Ball {
    private int radius;

    private String color;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Ball(int  radius, String color) {
        this.radius =  radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
