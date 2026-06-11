package GreedyAlgo;
import java.util.Arrays;

// given two arrays A and B of equal length n, 
// pair each element of array A to an element in array B, 
// such that sum S of absolute differences of all the pairs is minimum
// A = [4, 1, 8, 7]
// B = [2, 3, 6, 5]

// to get minimum absolute difference we need A and B close as much posbile 
// means we need A -B minimum
// time complexity O(n logn)
public class MinAbsoluteDifferencePair { 
    public static void main(String[] args) {
        
    int A[] = {4, 1, 8, 7};
    int B[] = {2, 3, 6, 5};

    Arrays.sort(A);
    Arrays.sort(B);
    
    int minDiff =0;

    for (int i =0; i<A.length; i++){
        minDiff+= Math.abs(A[i] - B[i]);
    }

    System.err.println("Minimum Absolute difference is " + minDiff);
    }
    
}
