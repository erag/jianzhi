public class reversel {

        public ListNode ReverseList(ListNode head) {
            if(head==null||head.next==null){
                return head;

            }
            ListNode q=head;
            head=head.next;
            ListNode p=head;
            while(head.next!=null){
                p=head.next;
                head.next=q;
                q=head;
                head=p;

            }
            p.next=q;
            return p;

        }

}
