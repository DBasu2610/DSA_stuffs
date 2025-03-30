package DP;

public class MinSubsetSumDifference {
    public static void main(String[] args) {
        int arr[] = {3,2,7};
        System.out.println(sum(arr, arr.length));
        
    }

    static int sum(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum+=arr[i]; 
        }

        int k = totalSum;
        boolean[][] dp = new boolean[n][k+1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if(arr[0]<=k) {
            dp[0][arr[0]] = true;
        }

        for(int ind=1;ind<n;ind++) {
            for(int target=1;target<=k;target++) {
                boolean noTake = dp[ind-1][target];
                boolean take = false;
                if(arr[ind]<=target) {
                    take = dp[ind-1][target-arr[ind]];
                    dp[ind][target] = noTake || take;
                }
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<=totalSum/2;i++) {
            if(dp[n-1][i]) {
                mini = Math.min(mini, Math.abs((totalSum-i)-i));
            }
        }
        return mini;
    }
}
