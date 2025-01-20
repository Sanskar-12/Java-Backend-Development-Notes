
class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }

    public int sound(int n1) { // This is Method Overloading
        return n1;
    }
}

class Dog extends Animal {
    public void sound() { // This is also method overriding
        System.out.println("Dog sound");
    }
}

class Rabbit extends Animal {
    public void sound() {
        System.out.println("Rabbit sound");
    }
}

public class Poly {
    public static void main(String[] args) {
        Animal obj=new Dog(); // Which show method to call decided at runtime and object type which is Dog ( Dynamic Dispatch at Runtime )
        obj.sound();
    }
}

// Polymorphism --> means many forms

// There are two types
// 1. Compile time polymorphism --> Which method to run is decided in compile time ( Method overloading )
// 2. Run time polymorphism --> Which method to run is decided in run time ( Method Overriding )

// Dynamic dispatch --> Dynamic dispatch in Java refers to the process by which the method to be called is determined
// at runtime, based on the actual object type, not the reference type.
