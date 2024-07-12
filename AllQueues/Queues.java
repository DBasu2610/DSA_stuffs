package DSA_stuffs.AllQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(4);
        queue.add(14);
        queue.add(92);
        queue.add(17);

        System.out.println(queue.remove());
        System.err.println(queue.remove());
        
    }
    
}
