package DSA_stuffs.LinkedList;

public class DoublyLinkedList {
    private int size;
    private Node head;


    public DoublyLinkedList() {
        this.size =0;
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }
          
    }

    public void InsertAtBeg(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void InsertAtEnd(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next= null;

        if(head==null) {
            node.prev= null;
            head=node;
            return;
        }
        while(last.next!=null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        size++;
    }

    public Node findValue(int val) {
        Node node = head;
        while (node!=null) {
            if(node.val==val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void Insert(int val, int after) {
        Node p = findValue(after);
        if(p==null) {
            System.out.println("Node doesnt exist");
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
       if(node.next!=null) {
        node.next.prev = node;
       }
       size++;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while(node!=null) {
            System.out.print(node.val+"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        while(last!=null) {
            System.out.print(last.val+"->");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.InsertAtBeg(5);
        list.InsertAtBeg(9);
        list.InsertAtEnd(99);
        System.out.println(list.size);
        System.out.println();
        list.Insert(6, 9);
        list.display();
        
    }
}
