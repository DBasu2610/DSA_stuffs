package DP;

public class DPOnStocks6TransactionFee {
    public static void main(String[] args) {

        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        int[][] dp = new int[prices.length][2];
        for(int i=0;i<prices.length;i++) {
            for(int j=0;j<2;j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(maxProfit(prices, 0, 1, dp,fee));
        
    }

    static int maxProfit(int[] prices, int i, int buy,int[][] dp,int fee) {
        int profit = 0;
        if(i>=prices.length) {
            return 0;
        }

        if(dp[i][buy]!=-1) {
            return dp[i][buy];
        }

        if(buy==1) {
             int take = -prices[i] + maxProfit(prices, i+1, 0, dp,fee);
             int notTake = 0 +  maxProfit(prices, i+1, 1, dp,fee);
             profit = Math.max(take, notTake);
        }
        else {
            int sell = prices[i] + - fee +  maxProfit(prices, i+1, 1, dp,fee);
            int notSell = 0 + maxProfit(prices, i+1, 0, dp,fee);
            profit = Math.max(sell, notSell);
        }
        return dp[i][buy]=profit;
    }
    
}
