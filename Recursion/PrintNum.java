package Recursion;

public class PrintNum {
    static int func(int n) {
        if(n==1) {
            return 1;
        }
        System.out.println(n);
        return func(n-1);
    }
    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
