package DSA_stuffs.AllQueues;

public class CircularQueue  {
    protected int data[];
    private static final int DefaultValue = 10;

    protected int end = 0;
    protected int front = 0;
    private int size =0;

    public CircularQueue() {
        this(DefaultValue);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;   
    }

    public boolean isEmpty() {
        return size == 0;   
    }

    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!!");
        }
        int item = data[front++];
        front = front%data.length;
        size--;
        return item;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        int i = 0;
        do {
            System.out.print(data[i]+" ");
            i++;
            i=i%data.length;
        }while(i!=0);
        
        System.out.println("END");
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!!");
        }
        return data[front];
    }


}
