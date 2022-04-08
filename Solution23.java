import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution23 {
    public static ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if(length == 0) return null;
        ListNode dummyhead = new ListNode(0);
        ListNode cur = dummyhead;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        // 将所有链表头节点放入最小堆中
        for(ListNode list : lists){
            if(list == null) continue;
            queue.add(list);
        }
        while(!queue.isEmpty()){
            ListNode curr = queue.poll();
            cur.next = curr;
            cur = cur.next;
            if(curr.next!=null){
                curr = curr.next;
                queue.add(curr);
            }
        }
        return dummyhead.next;
    }

    public static void main(String[] args) {
        int[] arrs1 = {1,2,4};
        int[] arrs2 = {1,3,4};
        int[] arrs3 = {3,5,11};
        ListNode l1 =  createLinkedList(arrs1);
        ListNode l2 =  createLinkedList(arrs2);
        ListNode l3 =  createLinkedList(arrs3);
        ListNode[] l = {l1,l2,l3};
//        printLinkedList(l1);
//        printLinkedList(l2);
        ListNode l4 = mergeKLists(l);
        printLinkedList(l4);
    }

    private static ListNode createLinkedList(int[] arr) {
        if(arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i = 1;i<arr.length;i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while(current!=null) {
            System.out.printf("%d ->",current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }
}
