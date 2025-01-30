package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int target=5;

        int result=linearSearch(arr,target);

        if(result!=-1) {
            System.out.println("Element found at index : "+result);
        } else {
            System.out.println("Element not found");
        }
    }

    // --> Main Logic
    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }

        return -1;
    }
}

// Linear Search

// It will search the element by iterating all the elements in array one by one

// Time Complexity : O(n)