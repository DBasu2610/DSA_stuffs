package DP;

public class HouseRobber {
    public static void main(String[] args) {
        int[] a = {2,1,4,9};
        int n = a.length;
        int[] dp = new int[n+1];
        
        
        
    }

    static int maxSumMemo(int[] dp, int[] arr, int n) {
        if (n < 0) {
            return 0;
        }
        if(n==0) {
            return arr[0];
        }
        if(n<0) {
            return 0;
        }
        if(dp[n]!=0) {
            return dp[n];
        }
        int pick = arr[n] + maxSumMemo(dp,arr,n-2);
        int notPick = maxSumMemo(dp,arr,n-1);
        dp[n] = Math.max(pick, notPick);
        return dp[n];  
    }

}
