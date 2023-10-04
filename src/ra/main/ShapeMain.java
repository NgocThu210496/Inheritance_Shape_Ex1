package ra.main;

import ra.entity.Circle;
import ra.entity.Rectangle;
import ra.entity.Square;
import ra.inheritance.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("yellow", false);
        System.out.println(shape);

        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("red", true, 4.5);
        System.out.println(circle);

        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0, 3.0);
        System.out.println(rectangle);

        rectangle = new Rectangle("blue", false, 3.0, 6.0);
        System.out.println(rectangle);

        System.out.println("---------SQUARE----------");
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("blue", true, 5.0, 5.0);
        System.out.println(square);

    }
}
