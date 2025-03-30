package DP;

import java.util.Arrays;

public class CountSubsetsWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int sum = 3;
        
        // Initialize dp array with -1 for memoization
        int[][] dp = new int[arr.length][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(count(arr.length - 1, sum, arr, dp));
    }

    static int count(int ind, int sum, int[] arr, int[][] dp) {
        if (sum == 0) {
            return 1;  // A valid subset is found
        }

        if (ind == 0) {
            return (arr[ind] == sum) ? 1 : 0;
        }

        // Memoization check
        if (dp[ind][sum] != -1) {
            return dp[ind][sum];
        }

        // Not picking the current element
        int notPick = count(ind - 1, sum, arr, dp);
        
        // Picking the current element (if sum allows)
        int pick = 0;
        if (arr[ind] <= sum) {
            pick = count(ind - 1, sum - arr[ind], arr, dp);
        }

        return dp[ind][sum] = notPick + pick;
    }
}
