class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            minPrice = Math.min(prices[i], minPrice);
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit;
    }
}
