package Recursion.StringRecursion;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 0);
        String s = "ab";
        subascii("", s);

    }

    static void subascii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p + "  ");
            return;
        }

        char ch = up.charAt(0);
        subascii(p+ch, up.substring(1));
        subascii(p, up.substring(1));
        subascii(p+(ch+0), up.substring(1));
    }
}
