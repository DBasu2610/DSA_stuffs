package DP;

public class MinimumCoins {
    public static void main(String[] args) {
        int[] coins = {9,6,5,1};
        int tar = 11;
        int[][] dp = new int[coins.length][tar+1];
        for(int[] row: dp) {
            for(int i=0; i<row.length; i++) {
                row[i] = -1;
            }
        }
        System.out.println(minCoins(coins, tar, coins.length-1,dp));
        
    }

    static int minCoins(int[] coins, int tar, int ind, int[][] dp) {
          if(ind==0) {
            if(tar%coins[0]==0) {
                return tar/coins[0];
            }
            else {
                return (int) 1e9;
            }
          }

            if(dp[ind][tar]!=-1) {
                return dp[ind][tar];
            }

          int notPick = minCoins(coins, tar, ind-1,dp) +0;
          int pick = Integer.MAX_VALUE;
          if(coins[ind]<=tar) {
            pick = 1 + minCoins(coins, tar-coins[ind], ind,dp);
          }

          return dp[ind][tar]=Math.min(notPick, pick);
    }
}
