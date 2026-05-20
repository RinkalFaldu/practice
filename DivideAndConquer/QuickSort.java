// time complexity
// average O(nlogn)
//worst O(n^2) . it happen when pivot is always smallest or the largest element
// space complexity O(1)
// different ways to choose pivot e.g. last element, first element, mid element, or rendom element
// it makes changes into original array

package DivideAndConquer;

public class QuickSort {
    public static void sort (int arr[], int start, int end){
        if (start >= end){
            return;
        }
        // last element as pivot
       int pivotIndex = partition (arr, start, end);
       sort(arr, start, pivotIndex -1); //  left part
       sort (arr, pivotIndex+1, end);  // right part

    }
    public static int partition (int arr[], int start, int end){
        int pivot = arr[end]; // last element
        int i = start-1; // to make place for element smaller than pivot

        for (int j = start; j <end; j++){
            if (arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // this logic place pivot in right index
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void printArr (int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " "); 
        }
        System.out.println();
   }

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        sort (arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
