package Recursion.MazeProblems;

public class CountNoOfPaths {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(countPaths(row, col));
        
    }

    static int countPaths(int row, int col) {
        if(row==1||col==1) {
            return 1;
        }
        int left = countPaths(row-1, col);
        int right = countPaths(row, col-1);
        return left + right;
    }
}
