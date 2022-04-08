public class Solution24 {

    public static ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode back = head,front = head.next;
        while(front != null && front.next!=null){
            ListNode next = front.next;
            front.next = back;
            back.next = next;
            prev.next = front;
            prev = back;
            back = next;
            front = back.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        Test_LinkedList t = new Test_LinkedList();
        ListNode arrs = t.Create(arr);
        ListNode listNode = swapPairs(arrs);
        t.Print(listNode);
    }

}
