package DP;

public class MaxSumOfNonAdjElements {
    public static void main(String[] args) {
        int[] a = {2,1,4,9};
        int n = a.length;
        int[] dp = new int[n+1];
        System.out.println(maxSumMemo(dp,a,n-1));
        System.out.println(maxSumTab(a,n-1,dp));
        System.out.println(maxSumSpaceOpt(n,a));
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


    static int maxSumTab(int[] arr, int n, int[] dp) {
        dp[0] = arr[0];
        // int neg = 0;
        for(int i=1;i<n;i++) {
            int pick = arr[i];
            if(i>1) {
                pick = arr[i] + dp[i-2];
            }
            int notPick = 0 + dp[i-1];
            dp[i] = Math.max(pick, notPick);
            
        }
        return dp[n];
    }


    static int maxSumSpaceOpt(int n,int[]arr) {
        int prev = arr[0];
        int prev2 = 0;
        for(int i=1;i<n;i++) {
            int pick = arr[i];
            if(i>1) {
                pick = arr[i] + prev2;
            }
            int notPick = 0 + prev;
            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev=curr;

        }
        return prev;
    }
    
}


