// To Check if the number is odd or even
public class TernaryOp {
    public static void main(String[] args) {
        int num = 10;
        String res = "";

        // with if else
        if (num % 2 == 0) {
            res = "Number is Even";
        } else {
            res = "Number is Odd";
        }

        // System.out.println(res);

        // With Ternary operator in one line
        res = (num % 2 == 0) ? "Number is Even" : "Number is Odd";
        System.out.println(res);
    }
}
