package ru.mirea.java.practice3.zadanie2;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center= (" + center.x + "," + center.y  + ")" +
                '}' + '\n';
    }


    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        this.radius = radius;
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
