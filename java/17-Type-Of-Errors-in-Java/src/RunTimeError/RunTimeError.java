package RunTimeError;

public class RunTimeError {
    public static void main(String[] args) {
        //  int i = 0;
        //  int j = 18 / i; // --> This will give Arithmetic Exception and all the below code would not be run and you app will stop, so to handle it we have to use try-catch block

        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println(e); // This will print the error and will let the further code to execute
        }

        System.out.println("Hello"); // This will be executed whether there is an exception or not
    }
}

// Try Catch block

// Try block will execute your logic
// But if any exception comes in between executing the code in try block it will throw the error and it will be caught by catch block and then further code can execute
// So catch block will only be executed if there is any exception in the try block