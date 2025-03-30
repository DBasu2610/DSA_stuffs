package DSA_stuffs.LinkedList;

public class CircularLinkedList {
    int size;
    private Node head;
    private Node tail;
    
    public CircularLinkedList() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    public void Insert(int val) {
        Node node = new Node(val);
        if(head==null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail=node;

        size++;
    }

    public void Delete(int val) {
        Node node = head;
        if(node==null) {
            return;
        }
        if(node.val==val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.val==val) {
                node.next = n.next;
                break;
            }
        }while(node!=head);
    }

    public void display() {
        Node node = head;
        if(head!=null) {
            do {
                System.out.print(node.val+"->");
                node = node.next;
            }while(node!=head);
            System.out.println(head.val);
        }
    }


    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.Insert(4);
        list.Insert(9);
        list.Insert(89);
        list.Delete(9);
        list.display();
    }
}
