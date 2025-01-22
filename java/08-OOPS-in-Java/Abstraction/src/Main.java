// General Class Shape
abstract class Shape {
    String color;

    // constructor
    public Shape(String color) {
        this.color = color;
    }

    // abstract method
    public abstract double area();

    // non abstract method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(String color, int radius) {
        super(color); // calling the parent class contructor to set the color
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    int length, breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 3);
        Shape rectangle = new Rectangle("Blue", 3, 4);

        System.out.println("Area of circle and color respectively " + circle.area() + " : " + circle.color);
        System.out.println("Area of rectangle and color respectively " + rectangle.area() + " : " + rectangle.color);
    }
}

// Abstraction in Java

// Abstraction in Java is the process of hiding the implementation details of a class and exposing only the essential features to the user.
// abstract class can have abstract methods and non abstract methods both