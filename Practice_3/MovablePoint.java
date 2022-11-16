package Practice_3;

import java.util.Scanner;

public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point coordinates");

        x = input.nextInt();
        y = input.nextInt();

        System.out.println("Enter point speed");

        xSpeed = input.nextInt();
        ySpeed = input.nextInt();
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}