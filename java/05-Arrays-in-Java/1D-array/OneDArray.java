
public class OneDArray {
    public static void main(String[] args) {
        // initialise the array
        int arr[] = { 1, 2, 3, 4 };

        // updating the value of array at index 0
        arr[0] = 2;

        System.out.println(arr[0]); // printing the value of the array at index 0

        // another way of initialising empty array of length 4
        int arr1[] = new int[4];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;

        System.out.println(arr1[0]);

        System.out.println(arr1); // Note : This prints the address or memory location of arr1

        // if we have to print the values of arr1
        for (int i = 0; i <= 3; i++) {
            System.out.print(arr[i]);
        }
    }
}
