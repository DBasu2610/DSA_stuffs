package Recursion.StringRecursion;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {

        String s = "abc";
        substring("",s);
        System.out.println(substring1("",s));
        
    }


    static void substring(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + "  ");
            return;
        }

        char ch = up.charAt(0);

        substring(p, up.substring(1));
        substring(p+ch, up.substring(1));
    }


    //when returning an arraylist
    static ArrayList<String> substring1(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = substring1(p, up.substring(1));
        ArrayList<String> right = substring1(p+ch, up.substring(1));

        left.addAll(right);
        return left;
    }

}
