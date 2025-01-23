package RunTimeError;

public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 19;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("I dont want zero");
            }
        } catch (Exception e) {
            System.out.println(e); // This will print the error and will let the further code to execute
        }
    }
}

// Throw Keyword

// If we have to throw the Error in the catch block then we can use throw keyword