//An abstract class is a class that cannot be instantiated directly and may contain abstract methods (methods without a body).//

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Area of circle: " + circle.calculateArea());
        rectangle.draw();
    }
}
