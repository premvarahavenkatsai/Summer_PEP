class Solution {
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cp = Integer.MAX_VALUE;
        int profit = 0;
        for(int i:prices){
            if(cp > i) cp = i;
            profit = Math.max(profit,Math.abs(i -cp));
        }
        return profit;
    }
}