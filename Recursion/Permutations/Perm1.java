package Recursion.Permutations;

public class Perm1 {
    public static void main(String[] args) {
        String s = "abc";
        perm("",s);
        System.out.println(permCount("",s));
    }

    static void perm(String p, String unp) {
        if(unp.isEmpty()) {
            System.out.println(p);
            return;
        }
         
        char ch = unp.charAt(0);
        for(int i=0;i<=p.length();i++) {
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            perm(f+ch+l,unp.substring(1));
        }
    }

    static int permCount(String p, String unp) {
        if(unp.isEmpty()) {
            return 1;
        }
         
        char ch = unp.charAt(0);
        int count =0;
        for(int i=0;i<=p.length();i++) {
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            count = count + permCount(f+ch+l,unp.substring(1));
        }
        return count;
    }

    
}
