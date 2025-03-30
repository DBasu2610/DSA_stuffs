package DSA_stuffs.Recursion;

import java.util.ArrayList;
import java.util.List;
//GOOGLE
public class LetterCombination {
    public List<String> letterCombinations(String p,String digits) {
        
        if(digits.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
            
        }
        
        int digit  = digits.charAt(0) - '0';
        List<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            
            list.addAll(letterCombinations(p+ch,digits.substring(1)));
        }
        return list;
    }

   
}
