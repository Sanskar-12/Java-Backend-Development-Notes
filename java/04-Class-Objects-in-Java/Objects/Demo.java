
// This is a Calculator class which has add method in it to access this add method we have to make an object with the help of this class
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

}

public class Demo {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // This is how we define an object

        int result = cal.add(1, 2); // here we are accessing the method of the class
        System.out.println(result);
    }
}

// Class
// Class is a blueprint of objects and it contains all the properties and
// behaviours of objects

// Object
// With the help of objects we can access the methods and variables of that
// class