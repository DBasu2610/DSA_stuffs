package DP;

public class MazeWithObstacles {
    public static void main(String[] args) {
        System.out.println(countPathWithObstacle(2,2,new int[][]{{0,0,0},{0,-1,0},{0,0,0}}));
    }


    static int countPathWithObstacle(int r, int c, int[][] arr) {
        if(r>=0 && c>=0 && arr[r][c]==-1) {
            return 0;
        }

        if(r==0 || c==0) {
            return 1;
        }

        int right = countPathWithObstacle(r,c-1,arr);
        int down = countPathWithObstacle(r-1,c,arr);
        return right + down;
    }
}
