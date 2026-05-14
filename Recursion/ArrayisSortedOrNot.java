// time complexity O(n)
// space complexity O(n)
package Recursion;

public class ArrayisSortedOrNot {
    public static boolean isSorted (int arr[], int i){
        // base case check for last element of array
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr [i +1]){
            return false;
        }
       return isSorted(arr, i +1);
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(arr, 0));
    }
    
}
