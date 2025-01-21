
abstract class Animal {
    public abstract void sound(); // Every animal can have different sound so you cant define this method here --> This is called abstraction

}

class Dog extends Animal {
    public void sound() {
        System.out.println("Bark"); // Give the definition here
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj=new Dog(); // You have to create the object of the subclass
        obj.sound();
    }
}

// Abstract Keyword

// It is a part of Java's Object-Oriented Programming (OOP) principles to provide partial implementation while leaving  the details to be implemented by subclasses.
// To make a method abstract you have to create the class as abstract
// and you cant create the object of that class but can create the object reference