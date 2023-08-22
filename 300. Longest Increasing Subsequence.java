import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 1;

        dp[0] = 1;

        for(int i = 1; i < nums.length; i++){
            int maxLength = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j] && dp[j] > maxLength)
                    maxLength = dp[j];
            }
            dp[i] = maxLength + 1;
            max = Math.max(dp[i],max);
        }


        return max;
    }
}
