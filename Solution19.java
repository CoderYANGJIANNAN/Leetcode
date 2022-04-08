public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = `new ListNode(0,head);
        ListNode front = head,latter = dummy;
        while(n>1){
            front = front.next;
            n--;
        }
        while(front.next!=null){
            front = front.next;
            latter = latter.next;
        }
        latter.next = latter.next.next;
        ListNode ans = dummy.next;

        return ans;
    }

}
