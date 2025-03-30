package Recursion;

public class TowerOfHanoi {

    public static void steps(int n, String src, String helper, String dest) {
        if(n==1) {
            System.out.println("Disc "+ n + " is transferred from " + src + " to " +dest);
            return;
        }
        steps(n-1, src, dest, helper);
        System.out.println("Disc "+ n + " is transferred from " + src + " to " +dest);
        steps(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        steps(n, "src", "help", "dest");
    }
}
