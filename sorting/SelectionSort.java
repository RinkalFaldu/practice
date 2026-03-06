// Selection Sort time complexity O(n^2) 
// this sorting algorithems push smalles value in front and so on 
package sorting;
public class SelectionSort {
    public static void Selection (int arr[]){
       for ( int i =0; i< arr.length; i++){
            int possiblemin = i;
            for ( int j = i+1; j < arr.length -1; j++){
                if (arr[possiblemin] > arr [j]) {
                possiblemin = j;
                }
            }
            int temp = arr [possiblemin];
            arr [possiblemin] = arr[i];
            arr [i] = temp;

        }
    }
    public static void printArr (int arr[]){
        for ( int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Selection(arr);
        printArr(arr);
        
    }
}


    