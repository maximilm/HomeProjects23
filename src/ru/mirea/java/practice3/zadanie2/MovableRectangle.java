package ru.mirea.java.practice3.zadanie2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0,0,0,0);
    private MovablePoint bottomRight = new MovablePoint(0,0,0,0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft.y = y1;
        topLeft.x = x1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.y = y2;
        bottomRight.x = x2;
        bottomRight.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft = (" + topLeft.x + "," + topLeft.y + ")" +
                ", bottomRight= (" + bottomRight.x + "," + bottomRight.y + ") " +
        '}' + '\n';
    }

    @Override
    public void moveUp() {
        if (checkPointsSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (checkPointsSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (checkPointsSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (checkPointsSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    public boolean checkPointsSpeed() {
        if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
            return false;
        } else return true;
    }
}
