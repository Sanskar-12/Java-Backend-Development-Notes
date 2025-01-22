package InterfaceClass;

interface A { // In interface all the methods are abstract
    int age = 30;
    String place = "Mumbai"; // So variables will be final and static

    void show(); // abstract method

    void config();
}

interface C {
    void run();
}

interface Y extends C { // Y extends C

}

class B implements A, Y { // Implementing multiple Interfaces
    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }

    public void run() {
        System.out.println("In Run");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        A obj = new B(); // Dynamic Dispatch
        obj.config();
        obj.show();

        C obj2 = new B();
        obj2.run();

//        A.age=30; --> Cannot change the value of the variable because its final

        System.out.println(A.age); // Can access directly with the Interface Class name because its static
        System.out.println(A.place);
    }
}

// Interface vs Abstract Class

// Note : In Interface Class all the methods are by default public abstract

// In Interface Class you can only make abstract methods (vs) In Abstract Class you can make both abstract methods and non abstract methods
// In Interface Class by default every method is abstract you dont have to specify it (vs) In Abstract Class you have to specify which is abstract method and which is not
// In Interface we can implement mulitple interfaces (vs) In Abstract you cant implement multiple Inheritance because Mulitple Inheritance is not supported in Java

// So Interface means it will create the design for you means methods and you have to implement it by making a new class which implements the interface class

// In Interface you can also declare variables but they will be final and static means they will be constant and can accessed by Interface Class name

// In Interface you can extend it also

// Interfaces methods doesnt have body and its usually implemented for writing company policy

// Note :
// class -- class --> extends
// interface -- class --> implements
// interface -- interface --> extends