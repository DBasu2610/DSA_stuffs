//Given a string, compute recursively a new string where all the 'a' chars have been removed. Example: Input: "xaxb" Output: "xb"

package Recursion.StringRecursion;

public class Remove_a {
    public static void main(String[] args) {
        String s = "baccad";
        remove("",s);
        System.out.println(remove(s));
        System.out.println(removeApple("applebaccadappledb"));
    }

    static void remove(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='a') {
            remove(p, up.substring(1));
        } else {
            remove(p+ch,up.substring(1));
        }
    }


    //when returning a string
    static String remove(String up) {
        if(up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if(ch=='a') {
            return remove(up.substring(1));
        } else {
            return ch +remove(up.substring(1)) ;
        }
    }


    //when removing a string
    static String removeApple(String up) {
        if(up.isEmpty()) {
            return "";
        }


        if(up.startsWith("apple")) {
            return removeApple(up.substring(5));
        } else {
            return  up.charAt(0) + removeApple(up.substring(1)) ;
        }
    }
}
