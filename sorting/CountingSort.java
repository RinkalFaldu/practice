// this algo used for limited number of element, or limited range

package sorting;

public class CountingSort {
    public static void counting (int arr []) {
        int largest = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++){
            largest = Math.max (largest, arr [i]);
        }
        int frequency [] = new int [largest +1];
        for (int i =0; i< arr.length; i++){
            frequency [arr[i]]++;
        }
        // sorting iterate on frequency array 
        int j =0;
        for ( int i =0; i< frequency.length ; i++){
            while (frequency [i] > 0) {
                arr [j] = i;
                j++;
                frequency [i] --;

            }
        }
    }

    public static void printArr (int arr[]){
        for ( int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        counting(arr);
        printArr(arr);
    }
    
}
