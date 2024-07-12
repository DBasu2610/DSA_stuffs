package DSA_stuffs.AllQueues;

public class CustomQueue {
    protected int data[];
    private static final int DefaultValue = 10;

    int end = 0;

    public CustomQueue() {
        this(DefaultValue);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;   
    }

    public boolean isEmpty() {
        return end == 0;   
    }

    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!!");
        }
        int item = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return item;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
            
        }
        System.out.println("END");
    }





    
    
}
