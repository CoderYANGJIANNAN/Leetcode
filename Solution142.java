public class Solution142 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isRing = false;
        int lengthOfring = 0;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                if(isRing){
                    break;
                }
                else {
                    isRing = true;
                }
            }
            if(isRing){
                lengthOfring = lengthOfring+2;
            }
        }
        if(!isRing) return null;
        slow = head;
        fast = head;
        for(int i = 0;i<lengthOfring-1;i++){
            fast = fast.next;
        }
        while(fast.next!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast.next;
    }

}
