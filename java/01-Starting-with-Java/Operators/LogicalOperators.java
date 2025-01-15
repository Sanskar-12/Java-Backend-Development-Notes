
public class LogicalOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int num3 = 10;
        int num4 = 30;

        boolean result = false;
        // &&
        result = (num1 < num2) && (num3 > num4); // result will be false

        // ||
        result = (num1 < num2) || (num3 > num4); // result will be true

        // !
        boolean isRaining = false;

        // Using the Logical NOT operator
        if (!isRaining) { // true
            System.out.println("It's not raining. You don't need an umbrella!"); // this will get executed
        } else {
            System.out.println("It's raining. Take an umbrella!");
        }
    }
}

// Logical Operators

// 1. && (AND) --> if all the expression is true then it will result as true
// 2. || (OR) --> if one of the expression is true then it will result as true
// 3. ! (NOT) --> used to change from true to false and false to true
