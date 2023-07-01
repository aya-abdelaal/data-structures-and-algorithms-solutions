class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 1)
            return 0;

        int i = 1;
        int profit = 0;

        while(i < prices.length){
            if(prices[i - 1] < prices[i]){
                //buy stock yesterday and sell today
                profit += prices[i] - prices[i - 1];
            }
            i++;
        }

        return profit;
    }
}
