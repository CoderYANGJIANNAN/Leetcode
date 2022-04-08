public class Solution21 {

    public static ListNode mergeKLists(ListNode[] lists){
        return merge(lists,0,lists.length-1);
    }

    public static ListNode merge(ListNode[] lists,int l,int r){
        if(l == r){
            return lists[l];
        }
        if(l > r){
            return null;
        }
        int mid = (l+r)>>1;
        return mergeTwoLists(merge(lists,l,mid),merge(lists,mid+1,r));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0,null);
        ListNode head = ans;
        while(l1 != null || l2 != null){
            if(l1!=null && l2!=null) {
                if (l1.val <= l2.val) {
                    head.next = l1;
                    head = head.next;
                    l1 = l1.next;
                } else {
                    head.next  = l2;
                    head = head.next;
                    l2 = l2.next;
                }
            }else {
                if(l1 == null){
                    head.next  = l2;
                    return ans.next;
                }
                else if(l2 == null){
                    head.next  = l1;
                    return ans.next;
                }
            }
        }
        return ans.next;
    }

    //递归
//        if(l1 == null) return l2;
//        if(l2 == null) return l1;
//        if(l1.val <= l2.val) {
//        l1.next = mergeTwoLists(l1.next, l2);
//        return l1;
//        } else {
//        l2.next = mergeTwoLists(l1, l2.next);
//        return l2;


    public static void main(String[] args) {
        int[] arrs1 = {1,2,4};
        int[] arrs2 = {1,3,4};
        ListNode l1 =  createLinkedList(arrs1);
        ListNode l2 =  createLinkedList(arrs2);
        printLinkedList(l1);
        printLinkedList(l2);
        ListNode l3 = mergeTwoLists(l1,l2);
        printLinkedList(l3);
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
