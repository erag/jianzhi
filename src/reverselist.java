import java.util.ArrayList;
public class reverselist {
        ArrayList<Integer> arrayList=new ArrayList<>();
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            if (listNode == null) return arrayList;
            if (listNode.next != null) printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
            return arrayList;
        }


}
