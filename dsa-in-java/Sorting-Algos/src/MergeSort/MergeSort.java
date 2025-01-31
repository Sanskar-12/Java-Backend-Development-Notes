package MergeSort;

public class MergeSort {
    public static void merge(int[] arr,int l,int m,int r) {
        int n1=m-l+1;
        int n2=r-m;

        int[] lArr=new int[n1];
        int[] rArr=new int[n2];

        for(int i=0;i<n1;i++) {
            lArr[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++) {
            rArr[i]=arr[m+1+i];
        }

        // merging lArr and rArr
        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2) {
            if(lArr[i]<=rArr[j]) {
                arr[k]=lArr[i];
                i++;
                k++;
            } else {
                arr[k]=rArr[j];
                j++;
                k++;
            }
        }

        while(i<n1) {
            arr[k]=lArr[i];
            i++;
            k++;
        }

        while(j<n2) {
            arr[k]=rArr[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr,int l,int r) {

        if(l<r) {
            int m=(l+r)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            merge(arr,l,m,r);

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
        mergeSort(arr,0,arr.length-1);

        // --> After Sorting
        System.out.println();
        System.out.println("After Sorting:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
