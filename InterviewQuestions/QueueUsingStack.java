//Implement Queue using Stack

package DSA_stuffs.InterviewQuestions;

import java.util.Stack;

public class QueueUsingStack {
    
    public static void main(String[] args) {
        // Stack<Integer> first = new Stack<>();

        // first.push(5);
        // System.out.println(first.pop());
    }

}

class StackToQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public StackToQueue(Stack<Integer> first, Stack<Integer> second) {
        this.first = first;
        this.second = second;
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while ((!second.isEmpty())) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty() {
        return(first.isEmpty());
    }

    public int peek() {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();

        while ((!second.isEmpty())) {
            first.push(second.peek());
        }
        return peeked;

    }
    

}
