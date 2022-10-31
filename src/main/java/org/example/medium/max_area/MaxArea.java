package org.example.medium.max_area;

public class MaxArea {

    public static void main(String[] args) {
        MaxArea maxArea = new MaxArea();
        int max = maxArea.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
//        int max = maxArea.maxArea(new int[]{1,1});
        System.out.println("The max area is " + max);
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * width);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
