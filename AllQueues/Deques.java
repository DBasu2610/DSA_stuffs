package DSA_stuffs.AllQueues;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(39);
        deque.addLast(78);
        deque.addFirst(98);
        deque.add(2);
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        
    }
    
}
