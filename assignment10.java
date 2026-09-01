// abstract class - cannot be instantiated directly, may contain abstract and normal methods
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    // abstract method - no body, must be implemented by subclasses
    abstract double calculateArea();

    // normal method - has a body, inherited as-is
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // must implement the abstract method
    double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // must implement the abstract method
    double calculateArea() {
        return length * width;
    }
}

public class assignment10 {
    public static void main(String[] args) {

        // Shape obj = new Shape("Red");   // NOT allowed - cannot instantiate an abstract class

        Circle circle = new Circle("Red", 5);
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println();

        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println();

        // abstract class reference can point to a subclass object
        Shape shape = new Circle("Green", 3);
        System.out.println("Shape (Circle) Area: " + shape.calculateArea());
    }
}