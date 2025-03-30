package DSA_stuffs.Recursion;

public class CountZeroes {
    static int zeroes(int n) {
        int count =0;
        while(n>0) {
            int rem = n%10;
            if(rem==0) {
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(zeroes(30200));
    }
}
