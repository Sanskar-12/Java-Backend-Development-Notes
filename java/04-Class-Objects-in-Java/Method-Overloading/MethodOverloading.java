class Calc {
    // This is mehtod overloading
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calc cal = new Calc();

        // using first method
        int res1 = cal.add(2, 4);
        System.out.println(res1);

        // using second method
        double res2 = cal.add(2.4, 3.9);
        System.out.println(res2);

        // using third method
        int res3 = cal.add(3, 4, 5);
        System.out.println(res3);
    }
}

// What is Method Overloading

// Function with same name but different parameters and return type is called
// method overloading
// also called as Compile Time Polymorphism