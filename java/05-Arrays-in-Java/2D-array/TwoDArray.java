public class TwoDArray {
    public static void main(String[] args) {
        // Intialising 2d Array
        int arr[][] = new int[3][4];

        // One way of assigning the values
        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[0][2] = 3;
        // arr[0][3] = 4;
        // arr[1][0] = 5;
        // arr[1][1] = 6;
        // arr[1][2] = 7;
        // arr[1][3] = 8;
        // arr[2][0] = 9;
        // arr[2][1] = 10;
        // arr[2][2] = 11;
        // arr[2][3] = 12;

        // This random method is a static method thereby we can access it directly with
        // the help of class... Math is a class
        // Math.random();

        // Or we can use random method to assign values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        // Iterating the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Note : Static methods can be accessed directly with the class but for non
// static methods we have to create object of that class and then we can access
// the methods of that class
