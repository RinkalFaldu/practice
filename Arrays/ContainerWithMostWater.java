// leet code problem Number 11: Container with most water
// to get maxwater we have to find maxArea
// formula to get area is = height * width
// for heigh we used min height from left and right pointer
// width = right - left
// time complexity of this code is O (n)
package Arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea =  minHeight * width;
            maxArea = Math.max(maxArea,currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("MaxWater can store in given hight container is: " + maxArea(height));
    }
    
}
