import java.util.*;
class Solution {
    public int mincostTickets(int[] days, int[] costs) {

        int[] dp = new int[days.length];

        return helper (dp, days, 0, costs, days[0]);


        
    }

    public int helper(int [] dp, int [] days, int i, int[] costs, int day){


        //base cases
        if(i >= days.length)
            return 0;

        if(days[i] < day)
            return helper(dp, days, i+1, costs, day);

        if(dp[i] != 0)
            return dp[i];

        dp[i] = Math.min(costs[0] + helper(dp,days, i +1, costs, days[i] + 1), Math.min(
                        costs[1] + helper(dp, days, i +1, costs, days[i] + 7),
                        costs[2] + helper(dp, days, i +1, costs, days[i] + 30)));

        return dp[i];

        

        
    }
}
