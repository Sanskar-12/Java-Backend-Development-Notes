
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
        super(); // This calls the parent constructor
        System.out.println("In B");
    }

    public B(int n) { // Parameterised Constructor
        super(n);
        System.out.println("In B int");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

// Super Keyword

// Bydefault it will be present inside the constructor
// It will call the parent constructor first
// To call the parameterised constructor of the parent class we have to pass the
// parameter inside super()

// Now if we define super inside parent class then which contructor it calls ?
// It calls the constructor of Object Class

// So all the Parent Class extends Object Class
