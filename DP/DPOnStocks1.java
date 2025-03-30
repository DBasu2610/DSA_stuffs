package DP;

public class DPOnStocks1{
   public static void main(String[] args) {
         int[] prices = {7,1,5,3,6,4};
         System.out.println(maxProfit(prices));
    
   }


   static int maxProfit(int[] prices) {
    int mini = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
        int cost = prices[i]-mini;
        profit = Math.max(profit, cost);
        mini = Math.min(mini, prices[i]);
    }
    return profit;
   }
}