package DP;

public class VariableStartAndEndPoint {
    public static void main(String[] args) {
        int[][] grid = {
            {1,1,100},
            {2,2,3},
            {3,10,2}
        };
        int[][] dp = new int[grid.length][grid[0].length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<grid[0].length;i++) {
            max = Math.max(max, maxPathSum(grid, grid.length-1, i, dp));
        }
        System.out.println(max);
        
    }


    static int maxPathSum(int[][] grid, int r, int c, int[][] dp) {
        if(r==0) {
            return grid[r][c];
        }

        if(c<0 || c>=grid[0].length) {
            return Integer.MIN_VALUE;
        }

        if(dp[r][c]!=0) {
            return dp[r][c];
        }

        int up = grid[r][c] + maxPathSum(grid, r-1, c, dp);
        int upLeft = Integer.MIN_VALUE;
        int upRight = Integer.MIN_VALUE;
        if(c-1>0) {
             upLeft = grid[r][c] + maxPathSum(grid, r-1, c-1, dp);
        }
        if(c+1<grid[0].length) {
             upRight = grid[r][c] + maxPathSum(grid, r-1, c+1, dp);
        }

        return dp[r][c] = Math.max(up, Math.max(upLeft, upRight));
    }
}
