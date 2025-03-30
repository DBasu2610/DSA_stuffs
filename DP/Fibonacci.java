package DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int[] memo = new int[n+1];
        System.out.println(fiboMem(n,memo));
        System.out.println(fiboTab(n,memo));
        System.out.println(fiboOpt(n));
        
    }

    static int fiboMem(int n, int[] dp) {
        if(n==0 || n==1) {
            return n;
        }

        if(dp[n]!=0) {
            return dp[n];
        }

        dp[n] = fiboMem(n-1,dp) + fiboMem(n-2,dp);
        return dp[n];
    }


    static int fiboTab(int n, int[] dp) {
        if(n==0 || n==1) {
            return n;
        }

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    static int fiboOpt(int n) {
        if(n==0 || n==1) {
            return n;
        }

        int prev2=0;
        int prev1=1;
        int curr = 0;

        for(int i=2;i<=n;i++) {
            curr= prev1+ prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
