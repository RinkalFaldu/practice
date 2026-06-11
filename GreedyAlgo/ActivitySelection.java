package GreedyAlgo;
import java.util.*;
// you are given n activities with their start and end times. select the maximum number of activities that can be performed by a single person
// asumming that a person can only work on a single activity at a time
// activities are sorted according to end time
// start = [10,12,13]
// end = [20,25,30] ans = 2(Activity 0 & Activity 2)

// similar problem based on this concept
// 1. disjoint set
// 2. maximum meetings in a room

// step 1 = end time basis sort
// A0  select always
// non overlapping means start time >= last choosen activity end time

// time complexity O(n)

// in this greedy algo we choose activity 0 as mendetory we don't know it is best decision or not but we select something to start
public class ActivitySelection {
    public static void main(String[] args) {
        int start [] = {1, 3, 0, 5, 8, 5};
        int end [] = {2, 4, 6, 7, 9, 9};

        int maxAct =0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct =1;
        ans.add(0);
        int lastEnd =end[0];

        for (int i =0;i<end.length; i++ ){
            if (start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd =end[i];
            }
        }
        
        System.out.println("max Activities =" + maxAct);{
            for (int i =0; i<ans.size(); i++){
                System.out.print("A" + ans.get(i) + " ");
            }
        }
        System.out.println();
    }
    
}
