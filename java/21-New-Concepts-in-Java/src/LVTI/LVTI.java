package LVTI;

public class LVTI {
    public static void main(String[] args) {
        int a = 10;
        var b = 10; // --> LVTI

        int arr[] = new int[10];
        var arr1 = new int[10]; // --> LVTI

        int num1;
//        var num2; --> We cant define it without giving value to it


    }
}

// LVTI - ( Local Variable Type Inference )

// As Java is statically typed language means we have to define the data type of every variable
// LVTI allows us to use var as the general data type by which the compiler can know the data type of the value without specifying the data type
// It only works with local variables not instance variables
// It came in Java 10
// In LVTI we cant only declare the variables, we also have to define it