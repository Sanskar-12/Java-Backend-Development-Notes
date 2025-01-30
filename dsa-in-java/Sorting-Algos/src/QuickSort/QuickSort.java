package QuickSort;

public class QuickSort {
    public static int partition(int[] arr,int low,int high) {
        int pivot=arr[high];

        int i=low-1;

        for(int j=low;j<=high-1;j++) {
            if (arr[j] < pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void quickSort(int[] arr,int low,int high) {
        if(low<high) {
            int pi=partition(arr,low,high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,45,23,56};

        // --> Before Sorting
        System.out.println("Before Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        // --> Main Logic
        quickSort(arr,0,arr.length-1);

        // --> After Sorting
        System.out.println();
        System.out.println("After Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


// Quick Sort

// In Quick Sort in every iteration we first assume the pivot and then we try to keep the pivot in its exact position and break the arr from low to pivot-1 and pivot+1 to high
// So in every iteration each element goes to its exact position

// Time Complexity : Best Case O(nlogn)