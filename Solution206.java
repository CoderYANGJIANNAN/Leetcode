import java.util.List;
import java.util.Stack;

public class Solution206 {

    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while(curr!=null){
           ListNode nextNode = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextNode;
       }
       return prev;
    }
}

//        用栈
//        Stack<ListNode> stack = new Stack<>();
//        ListNode res = new ListNode(0,null);
//        ListNode ans = res;
//        while(head!=null){
//                stack.add(head);
//                head = head.next;
//                }
//                while(!stack.isEmpty()){
//                ListNode temp = stack.pop();
//                res.next = new ListNode(temp.val,null);
//                res = res.next;
//                }
//                return ans.next;