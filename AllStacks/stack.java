package DSA_stuffs.AllStacks;
import java.util.Stack;

public class stack {

     public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(85);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
     }
}

