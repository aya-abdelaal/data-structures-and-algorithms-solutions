class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while(right < prices.length){
            int prof = prices[right] - prices[left];
            if(prof > 0 && prof > maxProfit){
                maxProfit = prof;
            }
            else if(prof < 0)
                left = right;
            right++;
        }

        return maxProfit;
    }

    
}
