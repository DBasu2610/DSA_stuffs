package DP;

public class The01Knapsack {
    public static void main(String[] args) {
        int[] wt = {3,4,5};
        int[] val = {30,40,50};
        int W = 8;
        int[][] dp = new int[wt.length][W+1];
        for(int[] row: dp) {
            for(int i=0; i<row.length; i++) {
                row[i] = -1;
            }
        }
        System.out.println(maxVal(wt, val, W, wt.length-1, dp));
        
    }

    static int maxVal(int[] wt, int[] val, int W, int ind, int[][] dp) {
        if(dp[ind][W]!=-1) {
            return dp[ind][W];
        }
        if(ind==0) {
            if(wt[0]<=W) {
                return val[0]; 
            }
            else {
                return 0;
            }
        }

        int notpick = 0 + maxVal(wt, val, W, ind-1,dp);   //we add 0 as we do not take that item
        int pick = Integer.MIN_VALUE;
        if(wt[ind]<=W) {
            pick = val[ind] + maxVal(wt, val, W-wt[ind], ind-1,dp);
        }

        return dp[ind][W] = Math.max(notpick, pick);
    }
}
