import java.util.List;

public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead = new ListNode();
        newhead.next = head;
        ListNode p = newhead;
        while(n>0) {
            p = p.next;
            n--;
        }
        ListNode q = newhead;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return newhead.next;
    }
}
