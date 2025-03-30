package DP;

public class CountMaze {
    public static void main(String[] args) {
        int[][] dp = new int[5][4];
        System.out.println(path(4,3,dp));
        System.out.println(pathTab(4, 3));
    }


    static int path(int r, int c, int[][] dp) {
        if(r==1 || c==1) {
            return 1;
        }

        if(dp[r][c]!=0) {
            return dp[r][c];
        }

        int right = path(r,c-1,dp);
        int down  = path(r-1,c,dp);
        dp[r][c] =  right + down;
        return dp[r][c];
    }


    static int pathTab(int r, int c) {
        int[][] dp = new int[r+1][c+1];
        dp[0][0] =1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
            
                
            }
            
        }
        

        return dp[r][c];
        
    }
}
