class Solution {
    public int maxProfit(int[] prices) {   
        //left = buy
        int l = 0;
        //right = sell
        int r = 1;
        int maxP = 0;
        int profit = 0;
        
        while(r < prices.length) {
            //profitable?
            if(prices[l] < prices[r]) {
                profit = prices[r] - prices[l];
                maxP =  Math.max(maxP, profit); 
            }
            else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}