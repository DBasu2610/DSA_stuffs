package DP;

public class RodCutting {
    public static void main(String[] args) {
        int[] price = {2,5,7,8,10};
        int N = 5;
        int[][] dp = new int[price.length][N+1];
        for(int i=0;i<price.length;i++) {
            for(int j=0;j<=N;j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(maxPrice(price.length-1, price, N,dp));
        
    }

    static int maxPrice(int ind, int[] price, int N, int[][] dp) {
        if(ind==0) {
            return N*price[0];
        }

        if(dp[ind][N]!=-1) {
            return dp[ind][N];
        }

        int notPick = 0 + maxPrice(ind-1, price, N,dp);
        int pick = Integer.MIN_VALUE;
        int rodLength = ind+1;
        if(rodLength<=N) {
            pick = price[ind] + maxPrice(ind, price, N-rodLength,dp);
        }
        return Math.max(pick, notPick);
    }
}
