package DP;

public class PrintLongestSubsequence {
    public static void main(String[] args) {

        String s = "adcbc";
        String t = "dcadb";
        System.out.println(longestSub(s, t, s.length()-1, t.length()-1));
        
    }


    static String longestSub(String s, String t, int i1, int i2) {
        if(i1==0 || i2==0) {
            return "";
        }

        if(s.charAt(i1)==t.charAt(i2)) {
            return s.charAt(i1) + longestSub(s, t, i1-1, i2-1);
        }

        return longestSub(s, t, i1-1, i2).length()>longestSub(s, t, i1, i2-1).length()?longestSub(s, t, i1-1, i2):longestSub(s, t, i1, i2-1);
    }
}
