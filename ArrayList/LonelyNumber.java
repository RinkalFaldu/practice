package ArrayList;
import java.util.ArrayList;
import java.util.HashMap;


public class LonelyNumber {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums){
        ArrayList <Integer> result = new ArrayList <>();
         HashMap<Integer, Integer>  map = new HashMap<>();
         for (int i =0; i<nums.size(); i++){
             if(map.containsKey(nums.get(i))){
                map.put(nums.get(i),map.get(nums.get(i) +1) );   // this line put nums [i], and increase count by 1 if number adding second time
             }
             else {
                map.put(nums.get(i), 1); // here we are adding number second time
             }
            
         } 
         
         for (int i =0; i< nums.size(); i++){
            if (map.get(nums.get(i)) == 1 && !map.containsKey(nums.get(i) + 1) && !map.containsKey(nums.get(i) -1 )){
                result.add(nums.get(i));  
            }  
        }
        return result;

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(findLonely(nums));
    }
    
}
