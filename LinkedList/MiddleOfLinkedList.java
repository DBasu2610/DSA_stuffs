package DSA_stuffs.LinkedList;

public class MiddleOfLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while ((f.next!=null && f!=null)) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
