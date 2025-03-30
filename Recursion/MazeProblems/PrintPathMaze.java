package Recursion.MazeProblems;

public class PrintPathMaze {
    public static void main(String[] args) {
        print("", 3, 3);
    }

    static void print(String p, int row, int col) {
        if(row==1 && col==1) {
            System.out.println(p);
            return;
        }
        if(row>1) {
            print(p+"D", row-1, col);
        }
        if(col>1) {
            print(p+"R", row, col-1);
        }

    }
}
