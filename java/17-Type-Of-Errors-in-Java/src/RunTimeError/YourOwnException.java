package RunTimeError;

// This is how to make your own exception
class SanskarException extends Exception {

    // default Constructor
    public SanskarException() {
        super();
    }

    // Parameterised Constructor
    public SanskarException(String s) {
        super(s);
    }
}

public class YourOwnException {
    public static void main(String[] args) {
        int i = 19;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new SanskarException("I dont want zero");
            }
        } catch (SanskarException e) {
            System.out.println(e); // This will print the error and will let the further code to execute
        }
    }
}
