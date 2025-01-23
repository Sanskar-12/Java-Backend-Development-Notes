package RunTimeError;

public class EgOnRuntimeError {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int[] arr = new int[5]; // making an array of length 5

        String str = null;

        try {
            j = 18 / i; // --> If the i==0 it will give me an exception of arithmetic exception
            int res = arr[5]; // --> Will give me an exception of array index out of bound

            System.out.println(str.length()); // --> printing the length of a  null string
            // So to handle multiple exception and give out customise Errors we can use multiple catch blocks
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0"); // --> Handle divide by 0 error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound"); // --> Handle array out of bound error
        }
        // This Exception should be at the bottom of all the Exception because it's a parent class of all the Exception
        catch (
                Exception e) { // --> This Exception Class will handle all the exception which is not handled by the dev
            System.out.println("Something went wrong...");
        }

        System.out.println("Bye");
    }
}
