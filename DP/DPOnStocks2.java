package DP;

public class DPOnStocks2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[][] dp = new int[prices.length][2];
        for(int i=0;i<prices.length;i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        System.out.println(maxProfit(prices, 0, 1,dp));
        
    }

    static int maxProfit(int[] prices, int i, int buy,int[][] dp) {
        int profit = 0;
        if(i>=prices.length) {
            return 0;
        }

        if(dp[i][buy]!=-1) {
            return dp[i][buy];
        }

        if(buy==1) {
             int take = -prices[i] + maxProfit(prices, i+1, 0, dp);
             int notTake = 0 +  maxProfit(prices, i+1, 1, dp);
             profit = Math.max(take, notTake);
        }
        else {
            int sell = prices[i] + maxProfit(prices, i+1, 1, dp);
            int notSell = 0 + maxProfit(prices, i+1, 0, dp);
            profit = Math.max(sell, notSell);
        }
        return dp[i][buy]=profit;
    }
}
