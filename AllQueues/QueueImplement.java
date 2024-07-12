package DSA_stuffs.AllQueues;

public class QueueImplement {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(34);
        queue.insert(66);
        queue.insert(123);
        queue.insert(4);
        queue.insert(10);
        

        queue.display();
        System.out.println(queue.remove());
        
        System.out.println("----------");
        
        queue.display();
    }
    
}
