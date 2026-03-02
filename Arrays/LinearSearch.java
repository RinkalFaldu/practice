// this code do linear search on array element
// Time Complexity of Linear search: O(n)  

package Arrays;
public class LinearSearch {

    public static int linearSearch (int numbers[], int key){
        for ( int i =0; i <=numbers.length; i++){
            if (numbers [i] == key){
                return i;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println();
        int index = linearSearch (numbers, key);
        if (index == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Key is at index : " + index);
        }
    }
    
}
