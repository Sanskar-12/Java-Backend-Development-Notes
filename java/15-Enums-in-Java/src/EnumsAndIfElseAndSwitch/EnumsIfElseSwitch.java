package EnumsAndIfElseAndSwitch;

enum Status {
    Running,
    Pending,
    Cancelled
}

public class EnumsIfElseSwitch {
    public static void main(String[] args) {
        Status s = Status.Pending;

        // Using Enums with If-Else
        if (s == Status.Running) {
            System.out.println("All Good");
        } else if (s == Status.Pending) {
            System.out.println("Please Wait");
        } else {
            System.out.println("Try Again");
        }

        // Using Enums with Switch
        switch (s) {
            case Pending:
                System.out.println("Please Wait");
                break;

            case Running:
                System.out.println("All Good");
                break;

            case Cancelled:
                System.out.println("Try Again");
                break;

            default:
                System.out.println("Nice");
                break;
        }
    }
}
