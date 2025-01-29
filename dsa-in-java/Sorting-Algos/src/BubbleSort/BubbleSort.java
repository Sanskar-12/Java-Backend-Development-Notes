package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,1,45,23,56};

        // --> Before Sorting
        System.out.println("Before Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i< arr.length;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // --> After Sorting
        System.out.println();
        System.out.println("After Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

// Bubble Sort

// In Bubble Sort we place i at 0 and a nested loop of j and place at 0
// Now we compare j and j+1 and if j > j+1 then we swap
// So the bigger number will go at the last in every iteration of i

// Time Complexity : O(n^2)

