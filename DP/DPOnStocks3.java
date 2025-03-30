package DP;

public class DPOnStocks3 {
    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        int[][][] dp = new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++) {
            for(int j=0;j<2;j++) {
                for(int k=0;k<3;k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        System.out.println(maxProfit(prices, 0, 1, 2,dp));
        
    }

    static int maxProfit(int[] prices,int i,  int buy, int cap, int[][][] dp) {
        int profit = 0;
        if(i==prices.length) return 0;
        if(cap==0) return 0;

        if(dp[i][buy][cap]!=-1) {
            return dp[i][buy][cap];
        }

        

        if(buy==1) {
            int take = -prices[i] + maxProfit(prices, i+1, 0, cap,dp);
            int notTake = 0 + maxProfit(prices, i+1, 1, cap,dp);
            profit = Math.max(take, notTake);
        }

        else {
            int take = prices[i] + maxProfit(prices, i+1, 1, cap-1,dp);
            int notTake = 0 + maxProfit(prices, i+1, 0, cap,dp);
            profit = Math.max(take, notTake);
        }

        return dp[i][buy][cap]=profit;
    }
}
