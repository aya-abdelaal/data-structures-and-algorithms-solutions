class Solution {
    public int rob(int[] nums) {
        int rob1 = nums[0];

        int rob2 = 0;
        if(nums.length >1)
            rob2 = Math.max(rob1, nums[1]);
        
        for(int i = 2; i < nums.length; i++){
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return Math.max(rob1,rob2);
        
    }
}
