import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution148 {

    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode cur = head;
        while(cur!=null){
            queue.add(cur);
            cur = cur.next;
        }
        System.out.println(queue.size());
        ListNode ans = new ListNode(0,null);
        ListNode res = ans;
        while(!queue.isEmpty()){
            ListNode temp = queue.poll();
            ans.next = new ListNode(temp.val,null);
            ans = ans.next;
        }
        return res.next;
    }
}
