import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in); // Responsible to take input from the user

        int num = sc.nextInt();

        System.out.println(num);
    }
}

// System.out.println

// println is a method of PrintStream Class
// and out is an object which calls println method
// the Class of out is System and the out is static therefore we can access it directly with the help of class System

// Scanner Class

// It's a class by which we can take input from the user
// we have to create the object from the Scanner Class and we can access the methods from the object
// Here we have used nextInt which will accept the numbers from the terminal and we are printing it