
class A {
    public A() { // Default Constructor
        super();
        System.out.println("In A");
    }

    public A(int n) { // Parameterised Constructor
        super();
        System.out.println("In A int");
    }
}

class B extends A { // Inheritance ( B depends on A )
    public B() { // Default Constructor
        super();
        System.out.println("In B");
    }

    public B(int n) { // Parameterised Constructor
        this();
        System.out.println("In B int");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

// This Keyword

// This keyword calls the constrcutor of the same class
// its opposite of Super keyword
// Super keyword calls the parent class constructor
// This keyword calls the same class constructor
