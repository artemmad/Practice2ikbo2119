package ru.mirea;

public class Circle {

    private int radius;
    private double xPos;
    private double yPos;
    private double space;

    public Circle(int radius, float xPos, float yPos) {
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
        getCircleSpace();
    }

    public Circle(int radius) {
        this.radius = radius;
        getCircleSpace();
    }

    public int getRadius() {
        return radius;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", space=" + space +
                '}';
    }

    public void print(){
        System.out.println(this);
    }

    public double getCircleSpace(){
        space = Math.PI * 2 * radius*radius;
        return space;
    }
}
