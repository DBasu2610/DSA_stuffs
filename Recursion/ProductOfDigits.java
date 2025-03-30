package Recursion;

public class ProductOfDigits {
    static int digitSum(int n) {
        if(n%10==n) {
            return n;
        }
        return n%10 * digitSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(88));
    }
}
