package ra.entity;

import ra.inheritance.Shape;

public class Circle extends Shape {
    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public static double radius = 1.0;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getArea() { //dien tich hinh tron
        return Math.PI * radius * radius;
    }

    public static double getPerimeter() {//chu vi hinh tron
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + " which is a subclass of "
                + super.toString();
    }
}
