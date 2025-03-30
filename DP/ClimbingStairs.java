package DP;
//in how many ways can one reach from the 0th to nth stair by climbing either one stair or two stairs at a time
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climb(4));
        
    }

    static int climb(int n) {
        if(n==0 | n==1) {
            return 1;
        }

        int[] dp = new int[n+1];
        if(dp[n]!=0) {
            return dp[n];
        }
        dp[n] = climb(n-1) + climb(n-2);
        return dp[n];
    }
}
