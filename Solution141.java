public class Solution141 {

    public boolean hasCycle(ListNode head) {
        ListNode front = head;
        ListNode latter = head;
        while(latter!=null && latter.next!=null){
            front = front.next;
            latter = latter.next.next;
            if(front == latter) return true;
        }
        return false;
    }

}
