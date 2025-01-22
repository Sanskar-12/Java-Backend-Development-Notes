package Enums;

enum Status {
    Running,
    Pending,
    Cancelled
}

public class Enums {
    public static void main(String[] args) {
        Status s = Status.Pending; // Enums.Status is a class and inside that all these are objects
        System.out.println(s);

        System.out.println(s.ordinal());  // According to enum order it prints the index

        Status[] ss = Status.values(); // To print every value of enums
        // for loop
//        for (int i = 0; i < ss.length; i++) {
//            System.out.println(ss[i]);
//        }

        // using enhanced for loop
        for (Status i : ss) {
            System.out.println(i);
        }
    }
}

// Enums.Enums in Java

// Enums.Enums in Java are special data types used to define a collection of constants