class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0;
        int left = 0;
        int min = nums.length+1;
        int sum = nums[0];

        while(right < nums.length){
            if(sum >= target){
                min = Math.min(min, right - left + 1); 
                sum-= nums[left];
               left++;
                
            }
            else{
                right++;
                if(right < nums.length)
                    sum+= nums[right];

            }
        }



        if(min > nums.length)
            return 0;
        else
            return min;

    }
}
