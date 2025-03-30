package DP;

public class DistinctSubsequences {
    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        int[][] dp = new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<t.length();j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(noOfDistinct(s, t, s.length()-1, t.length()-1,dp));

        
    }

    static int noOfDistinct(String s, String t, int i, int j, int[][] dp) {
        if(j<0) {
            return 1;
        }

        if(i<0) {
            return 0;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        if(s.charAt(i)==t.charAt(j)) {
            return noOfDistinct(s, t, i-1, j-1,dp) + noOfDistinct(s, t, i-1, j,dp);
        }
        else {
            return noOfDistinct(s, t, i-1, j,dp);
        }
    }
}
