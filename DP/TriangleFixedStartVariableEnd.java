package DP;

import java.util.List;

public class TriangleFixedStartVariableEnd {
    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
            List.of(1),
            List.of(2,3),
            List.of(3,6,7),
            List.of(8,9,6,10)
        );
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        System.out.println(minPath(0,0,triangle,dp));
        
    }

    static int minPath(int r, int c, List<List<Integer>> triangle,int[][] dp) {
          if(r==triangle.size()-1) {
                return triangle.get(triangle.size()-1).get(c);
          }

          if(dp[r][c]!=0) {
                return dp[r][c];
          }

          int down = triangle.get(r).get(c) + minPath(r+1, c, triangle,dp);
          int diagonal = triangle.get(r).get(c) + minPath(r+1, c+1, triangle,dp);
          return dp[r][c] = Math.min(down, diagonal);

    }
}
