public class Solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null) return null;
            ListNode StartOfA = headA;
            ListNode StartOfB = headB;

            while(headA!=headB){
                    if(headA == null) headA = StartOfB;
                    else headA = headA.next;
                    if(headB == null) headB = StartOfA;
                    else headB = headB.next;
            }
            return headA;
    }

}
