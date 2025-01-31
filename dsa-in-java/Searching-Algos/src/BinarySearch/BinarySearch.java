package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int target=3;

        int result=binarySearch(arr,target);

        if(result!=-1) {
            System.out.println("Element found at index : "+result);
        } else {
            System.out.println("Element not found");
        }
    }

    // --> Main Logic
    public static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;


        while(start<=end) {
            int mid=(start+end)/2;

            if(arr[mid]==target) {
                return mid;
            } else if(arr[mid]>target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }

        return -1;
    }
}

// Binary Search

// In Binary search At every step we eliminate half of the elements and then if my mid is equal to target then we would return the index of it

// Time Complexity : O(logn)
