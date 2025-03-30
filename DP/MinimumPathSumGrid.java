package DP;

public class MinimumPathSumGrid {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{5,9,6},{1,5,2}};
        System.out.println(minPathMemo(grid.length-1, grid[0].length-1, grid, new int[grid.length][grid[0].length]));
        
    }

    static int minPathMemo(int r, int c, int[][] grid, int dp[][]) {
        if(r==0 && c==0) {
            return grid[0][0];
        }

        if(r<0 || c<0) {
            return 99999;
        } 

        if(dp[r][c]!=0) {
            return dp[r][c];
        }

        int up = grid[r][c] + minPathMemo(r-1, c, grid, dp);
        int left = grid[r][c] + minPathMemo(r, c-1, grid, dp);
        dp[r][c] = Math.min(up, left);
        return dp[r][c];
    }
}
