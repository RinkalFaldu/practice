// approach
// divide by getting mid
// divide in half untill you get single element
// mid = start + ( end - start)/2
// mergesort (left)
// mergesort (right)
// merge
// this also use concept of recursion
// time complexity O(nlogn)
// space O(n)

package DivideAndConquer;

public class MergeSort {
    public static void sort (int arr[], int start, int end){
        if (start >= end){
            return;
        }
        int mid = start + ( end - start)/2;
        sort (arr,start, mid ); // left side
        sort (arr, mid +1, end); // right side

        merge (arr, start, mid, end);

    }
    public static void merge (int arr[], int start, int mid, int end){
        int temp[] = new int[end - start +1];
        int i = start; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for tem arr

        while (i <= mid && j <= end){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                
            }
            else {
                temp [k] = arr[j];
                j++;
                
            }
            k++;
        }
        // for leftover elements of 1st sorted part
         while (i <= mid){
            temp [k++] = arr[i++];
         }
         // for leftover elements of 2nd sorted part
         while (j <= end){
            temp[k++] = arr[j++];
         }

         for (k = 0, i = start; k < temp.length; k++, i++){
              arr[i] = temp[k]; // copy element of temp element into  original arr
         }
    }
    public static void printArr (int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " "); 
        }
        System.out.println();
   }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        sort(arr,0,arr.length-1);
        printArr(arr);
        
    }
    
}



// different way to do merge sort with one argument in function
 /*public int[] sortArray(int[] nums) {
        int[] temp=new int[nums.length];
        mergeSort(nums,0,nums.length-1,temp);
        return nums;
    }
    public void mergeSort(int[] arr, int start , int end , int[] temp){
        if(start==end) return ;
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid, temp);
        mergeSort(arr,mid+1,end,temp);
        merge(arr,start,mid,end,temp);
    }
    public void merge(int[] arr,int start,int mid, int end, int[] temp){
        int i=start;
        int j=mid+1;
        int k=start;
        while(i<=mid && j<=end){
            if(arr[i] <=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid) temp[k++] =arr[i++];
        while(j<=end) temp[k++]=arr[j++];

        for(int p=start;p<=end;p++){
            arr[p]=temp[p];
        }
    } */