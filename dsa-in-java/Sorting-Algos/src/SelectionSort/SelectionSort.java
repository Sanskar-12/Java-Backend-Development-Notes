package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,1,45,23,56};

        // --> Before Sorting
        System.out.println("Before Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        // --> Main Logic
        for(int i=0;i<arr.length-1;i++) {
            int mini=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[mini]) {
                    mini=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
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

// Selection Sort

// In Selection Sort we assume the minimum element as the first index element and then we find the minimum element from the rest of the array and the we swap the found min element from the first element
// So its better than Bubble Sort because in Bubble Sort we are doing the swap every time but in this sorting algo we are swapping the values only once in every iteration

// Time Complexity : O(n^2)