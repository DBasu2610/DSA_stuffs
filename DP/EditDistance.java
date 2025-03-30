package DP;

public class EditDistance {
    public static void main(String[] args) {
        String s = "horse";
        String t = "ros";
        int[][] dp = new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<t.length();j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(minSteps(s, t, s.length()-1, t.length()-1,dp));
        
    }

    static int minSteps(String s, String t, int i, int j,int[][] dp) {
        if(i<0) {
            return j+1;
        }

        if(j<0) {
            return i+1;
        }

        if(dp[i][j]!=-1) {
            return dp[i][j];
        }

        if(s.charAt(i)==t.charAt(j)) {
            return minSteps(s, t, i-1, j-1,dp);
        }


        int insertion = 1 + minSteps(s, t, i, j-1,dp);
        int deletion = 1 + minSteps(s, t, i-1, j,dp);
        int replacement = 1 + minSteps(s, t, i-1, j-1,dp);

        return Math.min(insertion, Math.min(deletion, replacement));
    }
}
