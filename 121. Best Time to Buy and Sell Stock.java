class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = new Solution().maxProfit(prices);
        System.out.println(ans);
    }

    public int maxProfit(int[] prices) {
        int cp = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (cp > price) cp = price;
            profit = Math.max(profit, price - cp);
        }
        return profit;
    }
}