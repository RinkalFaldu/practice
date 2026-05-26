//versionCount:Foranarray,inversion count indicates how far(or close)the array is from being sorted.
//If the array is already sorted then the inversion count is 0.
// If anarray is sorted in the reverse order then the inversion count is the maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
// Sample Output 1: 3, 
// because it has 3 inversions -(2, 1), (4, 1), (4, 3).
package DivideAndConquer;

public class InversionCount {
    public static int merge (int arr[], int start, int mid, int end){
        int i = start;
        int j = mid;
        int k =0;
        int invCount =0;
        int temp [] = new int [(end - start +1)];

        while ((i < mid) && (j <= end)){
            if (arr[i] <= arr[j]){
                 temp[k] = arr[i];
                 i++;

            }
            else {
                temp[k] = arr[j];
                invCount += (mid -i);
                j++;
            }
            k++;
        }
        while (i < mid){
            temp[k++] = arr[i++];
        }
        while (j <= end){
            temp[k++] = arr[j++];
        }
        for (i = start, k = 0; i<= end; i++,k++){
            arr[i] = temp[k];
        }
        return invCount;
    }
    public static int mergeSort (int arr[], int start, int end){
        int invCount =0;
        if (end > start){
            int mid = (end + start)/2;
           invCount= mergeSort (arr, start, mid);
           invCount+= mergeSort(arr, mid +1, end);
           invCount+= merge (arr, start, mid +1, end);
            
        }
        return invCount;
    }
    public static int getInversions (int arr[]){
        int n = arr.length;
        return mergeSort (arr, 0, n-1);
    }
    
    
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println("Inversion Count = " + getInversions(arr));
        
    }
    
}
