
public class IfElseIf {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y && x > z) {
            System.out.println("X = " + x);
        } else if (y > z) {
            System.out.println("Y = " + y);
        } else {
            System.out.println("Z = " + z);
        }
    }
}

// if there are multiple checkings you can use else if block with if and else
