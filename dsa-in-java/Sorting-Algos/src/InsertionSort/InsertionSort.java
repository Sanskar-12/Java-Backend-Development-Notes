package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,1,45,23,56};

        // --> Before Sorting
        System.out.println("Before Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        // --> Main Logic
        for(int i=0;i<arr.length;i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
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

// Insertion Sort

// In Insertion Sort we try to insert the number in its original place by comparing the current value to previous value till we find the original place of that element

// Time Complexity : Worst Case O(n^2) and Best Case O(n)
