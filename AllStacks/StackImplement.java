package DSA_stuffs.AllStacks;

public class StackImplement {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(37);
        stack.push(7);
        stack.push(123);
        stack.push(90);
        stack.push(6);
       

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
