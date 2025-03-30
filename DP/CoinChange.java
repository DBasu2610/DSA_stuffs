package DP;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int tar = 4;
        int[][] dp = new int[arr.length][tar+1];
        for(int[] row: dp) {
            for(int i=0; i<row.length; i++) {
                row[i] = -1;
            }
        }
        System.out.println(noOfWays(arr.length-1, tar, arr,dp));
    }

    static int noOfWays(int ind, int tar, int[] arr, int[][] dp) {
        if(dp[ind][tar]!=-1) {
            return dp[ind][tar];
        }
        if(ind==0) {
            return tar%arr[0]==0?1:0;
        }


        int notPick = noOfWays(ind-1, tar, arr,dp);
        int pick = 0;
        if(arr[ind]<=tar) {
            pick = noOfWays(ind, tar-arr[ind], arr,dp);
        }

        return dp[ind][tar] = pick+notPick;
    }
}
