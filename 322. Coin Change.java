class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        if(amount==0)
            return 0;
        dp[0] = 0;

        for(int i = 1; i < dp.length; i++){
            int temp = Integer.MAX_VALUE;
            for(int j =0; j < coins.length; j++){
                if( i - coins[j]>-1 && dp[i - coins[j]] != -1)
                    temp = Math.min(temp, dp[i - coins[j]] + 1);
            }
            if(temp == Integer.MAX_VALUE)
             dp[i] = -1;
            else
                dp[i] = temp;
        }
        
        return dp[amount];
        
    }
}
