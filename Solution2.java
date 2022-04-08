public class Solution2 {

                public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                    if(l1 == null && l2 == null) return null;
                    if(l1 == null) return l2;
                    if(l2 == null) return l1;

                    ListNode dummyhead = new ListNode(-1),pre = dummyhead;
                    int carry = 0;
                    while(l1!=null||l2!=null||carry!=0){
                        int l1Val = l1!=null ? l1.val :0;
                        int l2Val = l2!=null ? l2.val :0;
                        int Sum = l1Val + l2Val + carry;
                        carry = Sum/10;

                        ListNode sumNode = new ListNode(Sum%10);
                        pre.next = sumNode;
                        pre = pre.next;
                        if(l1!=null) l1 = l1.next;
                        if(l2!=null) l2 = l2.next;
                    }


                    return dummyhead.next;
                }

}



