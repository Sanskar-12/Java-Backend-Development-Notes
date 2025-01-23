package RunTimeError;

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("A");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found" + e);
        }
    }
}

// Throws Keyword

// Suppose there are two methods above and the main method is calling the show method in the class A
// And the show method doesnt want to handle the exception so if i use throws keyword it passes the exception to the main method and then the main method is responsible to handle that exception

// Exact Definition of Throws
// If a method declares exceptions using throws, the caller of that method is responsible for handling or declaring those exceptions.
