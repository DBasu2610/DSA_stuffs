package DP;

public class LongestCommonSubsequence {
    public static void main(String[] args) {

        String s = "adcbc";
        String t = "dcadb";
        int[][] dp = new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<t.length();j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lengthOfLongest(s, t, s.length()-1, t.length()-1,dp));
        
    }

    static int lengthOfLongest(String s, String t, int i1, int i2, int[][] dp) {
        if(i1<0 || i2<0) {
             return 0;
        }

        if(dp[i1][i2]!=-1) {
            return dp[i1][i2];
        }

        if(s.charAt(i1)==t.charAt(i2)) {
            return 1+ lengthOfLongest(s, t, i1-1, i2-1,dp);
        }

        return dp[i1][i2] = 0 + Math.max(lengthOfLongest(s, t, i1-1, i2,dp), lengthOfLongest(s, t, i1, i2-1,dp));
    }
}
