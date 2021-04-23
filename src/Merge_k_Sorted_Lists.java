import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {

        Comparator<ListNode> valsort = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        };
        PriorityQueue<ListNode> heap = new PriorityQueue<>(valsort);
        for (ListNode l : lists) {
            if (l != null){
                heap.add(l);
            }
        }
        ListNode newhead = new ListNode();
        ListNode p = newhead;
        while (!heap.isEmpty()) {
            ListNode cur = heap.poll();
            p.next = new ListNode(cur.val);
            p = p.next;
            if (cur.next != null) {
                heap.add(cur.next);
            }
        }
        return newhead.next;
    }
}
