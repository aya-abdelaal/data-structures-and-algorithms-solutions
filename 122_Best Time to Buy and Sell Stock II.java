class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 1)
            return 0;

        int left = 0;
        int right = 1;
        int profit = 0;
        int maxProf = 0;

        while(right < prices.length){
            if(prices[right] < prices[right - 1]){
                //buy stock 
                profit += maxProf;
                maxProf = 0;
                left = right;
            } else {
                int tempProf = prices[right] - prices[left];
                maxProf = (maxProf > tempProf)? maxProf : tempProf;
            }
            right++;
        }

        if(prices[prices.length - 1] >= prices[prices.length - 2])
            profit += maxProf;

        return profit;
    }
}
