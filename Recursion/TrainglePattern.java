package Recursion;

public class TrainglePattern {
    static void print(int r, int c) {
        if(r==0) {
           return;
        }

        if(c<r) {
            System.out.print("* ");
            print(r, c+1);
        }else {
            System.out.println();
            print(r-1, 0);
        }
    }

    public static void main(String[] args) {
        print(5, 0);
    }
}
