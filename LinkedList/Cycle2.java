package DSA_stuffs.LinkedList;

public class Cycle2 {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
                }
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                length = lengthCycle(slow);
                break;
            }
        }
        ListNode f = head;
        ListNode s = head;

        while(length>0) {
            s= s.next;;
            length--;
        }
        while(f!=s) {
            f = f.next;
            s = s.next;
        }

        if(length==0) {
            return null;
        }
        return s;
    }

    private int lengthCycle(ListNode slow) {
        ListNode temp = slow;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        }while(temp!=slow);
        return length;
    }

}
