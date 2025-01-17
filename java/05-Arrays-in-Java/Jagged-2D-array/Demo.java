
public class Demo {
    public static void main(String[] args) {
        // Initialising the Jagged Array
        int arr[][] = new int[3][];

        // Specifying the no of columns of each row
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        // Giving the values of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        // Iterating the Jagged Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// Jagged Array

// Jagged Array is a 2D array which have different no of columns at each row
// We have explicitly specify the no of columns for each row
