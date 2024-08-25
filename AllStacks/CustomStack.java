package DSA_stuffs.AllStacks;

public class CustomStack {
    protected int data[];
    private static final int DefaultValue = 10;

    int ptr = -1;

    public CustomStack() {
        this(DefaultValue);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if(isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length-1;   
    }

    private boolean isEmpty() {
        return ptr == -1;   
    }

    public int pop() {
       if(isEmpty()) {
        System.out.println("empty stack");
       }
       int item = data[ptr];
       ptr--;
       return item;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("empty stack");
           }
        return data[ptr];
    }


    
    
}
