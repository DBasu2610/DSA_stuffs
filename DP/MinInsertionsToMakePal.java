package DP;

public class MinInsertionsToMakePal {
    public static void main(String[] args) {
        String s = "abcaa";
        int[][] dp = new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<s.length();j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(s.length()-lengthOfLongest(s, s.length()-1, s.length()-1,dp));
        
        
    }

    static int lengthOfLongest(String s, int i, int j, int[][] dp) {

        
        String t = new StringBuilder(s).reverse().toString();

        if(i<0 || j<0) {
            return 0;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        if(s.charAt(i)==t.charAt(j)) {
            return 1 + lengthOfLongest(s, i-1, j-1,dp);
        }

        return dp[i][j] = 0 + Math.max(lengthOfLongest(s, i-1, j,dp), lengthOfLongest(s, i, j-1,dp));
        
    }
    
}
