public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(-1, null);
        ListNode p = newhead;
        int c = 0;
        while (l1 != null || l2 != null) {
            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a+b+c;
            c = sum / 10;
            sum = sum % 10;
            p.next = new ListNode(sum);
            p = p.next;
        }
        if (c == 1) {
            p.next = new ListNode(1);
        }
        return newhead.next;
    }
}
