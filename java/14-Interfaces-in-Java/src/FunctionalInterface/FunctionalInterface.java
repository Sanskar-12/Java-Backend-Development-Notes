package FunctionalInterface;

@java.lang.FunctionalInterface // Annotation for Functional Interface
interface A {
    void show(int i);
}

// This is one way to implement the show function
//class B implements A {
//    public void show() {
//        System.out.println("In B Show");
//    }
//}

public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = (int i) -> { // This Arrow is called Lambda Expression which decreases the lines of code
            System.out.println("In B Show " + i); // Also we can pass the parameter
        };


        obj.show(3);
    }
}


// Functional Interface

// Interface which have only one method is called Functional Interface

// Lambda Expression

// Lambda is syntactical sugar expression which decreases the lines of your code and it is used only with Anonymous Inner Class
