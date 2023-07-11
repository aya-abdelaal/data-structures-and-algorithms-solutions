class Solution {
    public int maxArea(int[] height) {
        //basically want to find the two most max line indices
        int left = 0;
        int right = height.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while(right > left){

            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater,water);
             if(height[right] > height[left])
                left++;
            else
            right--;

        }

        return maxWater;
    }
}
