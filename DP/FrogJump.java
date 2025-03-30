package DP;

public class FrogJump {
    public static void main(String[] args) {

        int[] height = {10,20,30,10};
        int n = height.length;
        int[] dp = new int[n+1];
        System.out.println(frogMemo(n-1,height,dp));
        
    }

    static int frogMemo(int n, int[] height, int[] dp) {
        if(n==0) {
            return 0;
        }

        if(dp[n]!=0) {
            return dp[n];
        }

        

        int left = frogMemo(n-1,height,dp) + Math.abs(height[n]-height[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1) {
             right = frogMemo(n-2, height,dp) + Math.abs(height[n]-height[n-2]);
        }

        return Math.min(left,right);
    }
}