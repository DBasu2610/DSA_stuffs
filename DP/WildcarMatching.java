package DP;

public class WildcarMatching {
    public static void main(String[] args) {
        String s = "adceb";
        String t = "*a*b";
        System.out.println(doesMatch(s, t, s.length()-1, t.length()-1));
        
    }


    static boolean doesMatch(String s, String t, int i, int j) {
        if(i<0 && j<0) {
            return true;
        }

        if(i<0 && j>=0) {
            return false;
        }

        if(j<0 && i>=0) {
            for(int k=0;k<i;k++) {
                if(s.charAt(k)!='*') {
                    return false;
                }
                return true;
            }
        }

        if(s.charAt(i)==t.charAt(j) || s.charAt(i)=='?') {
            return doesMatch(s, t, i-1, j-1);
        }

        if(s.charAt(i)=='*') {
            return doesMatch(s, t, i-1, j) || doesMatch(s, t, i, j-1);
        }

        return false;
    }
}
