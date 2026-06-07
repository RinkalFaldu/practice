package ArrayList;
import java.util.ArrayList;

// 2 pointer approach time complexity O(n)

public class OptmizeContainerWithMostWater {
    public static int getMaxWater (ArrayList<Integer> height){
        int left = 0;
        int right = height.size() -1;
        int maxWater =0;

        while (left < right){
            int width = right - left;
            int minheight =Math.min(height.get(left), height.get(right));
            int waterArea = minheight * width;
            maxWater = Math.max(maxWater, waterArea);

            if (height.get(left)< height.get(right)){
                left++;
            } 
            else {
                right--;
            }
        }
     return maxWater;    
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(getMaxWater(height));
    }
    
}
