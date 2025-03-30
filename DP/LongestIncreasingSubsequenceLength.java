package DP;

public class LongestIncreasingSubsequenceLength {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        int[][] dp = new int[arr.length][arr.length+1];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length+1;j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lengthOfLIS(arr, 0, -1,dp));
        
    }

    static int lengthOfLIS(int[] arr, int i, int prevI, int[][] dp) {
        if(i==arr.length) {
            return 0;
        }

        if(dp[i][prevI+1]!=-1) {
            return dp[i][prevI+1];
        }

        int notTake = 0 + lengthOfLIS(arr, i+1, prevI,dp);
        int take = 0;
        if(prevI==-1 || arr[i]>arr[prevI]) {
            take = 1 + lengthOfLIS(arr, i+1, i,dp);
        }
        return dp[i][prevI+1] = Math.max(take, notTake);
    }
}
