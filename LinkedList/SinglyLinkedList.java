package DSA_stuffs.LinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    

    public SinglyLinkedList() {
        this.size = 0;
    }


    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void InsertAtBeg(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null ){
            tail = head;
        }
        size = size +1;
    }

    public void InsertAtEnd(int val) {
        if(tail==null) {
            InsertAtBeg(val);
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size +1;
    }

    public void InsertPos(int val,int pos) {
        if(pos==0) {
           InsertAtBeg(val);
           return;
        } 
        if(pos==size-1) {
            InsertAtEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public int delFirst() {
        int val = head.value;
        head = head.next;
        if(head==null) {
            tail=null;
        }
        size--;
        return val;
    }

    public int delLast() {
        if(size<=1) {
            return delFirst();
        }
        Node secLast = getPos(size-2);
        int val = tail.value;
        tail = secLast;
        tail.next= null;
        return val;
    }

    public int delPos(int pos) {
        if(pos==0) {
            delFirst();
        }
        if(pos==size-1) {
            delLast();
        }
        Node prev = getPos(pos-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node getPos(int pos) {
         Node node = head;
         for (int i = 0; i < pos; i++) {
            node = node.next;
         }
         return node;
    }



    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.InsertAtBeg(5);
        list.InsertAtBeg(6);
        list.InsertAtBeg(7);
        list.InsertAtEnd(9);
        list.InsertPos(15, 2);
        System.out.println(list.size);
        list.display();
        System.out.println(list.delFirst());
        list.display();
        System.out.println(list.delLast());
        list.display();
        
        
    }
}