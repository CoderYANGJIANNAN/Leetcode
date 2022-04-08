public class Solution234 {

    public static boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode LastNode = head;
        ListNode MiddleNode = head;
        ListNode test = head;
        int lengthOflist = 1;
        while(LastNode.next!=null){
            lengthOflist++;
            LastNode = LastNode.next;
        }
        if(lengthOflist <=2){
            if(lengthOflist == 1) return true;
            else if (test.val == test.next.val)return true;
            else return false;
        }

        int MiddleOflist = lengthOflist%2 == 0? lengthOflist/2 :lengthOflist/2+1;
        for(int i = 1;i<MiddleOflist;i++){
            MiddleNode = MiddleNode.next;
        }
        ListNode pre = MiddleNode;
        ListNode curr = MiddleNode.next;
        reverseList(pre,curr);
        for(int i = 0;i<MiddleOflist;i++){
            if(head.val!=LastNode.val) return false;
            head = head.next;
            LastNode = LastNode.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode prev,ListNode curr) {
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arrs1 = {1,2,2,1};
        ListNode l1 =  createLinkedList(arrs1);
        printLinkedList(l1);
        System.out.println(isPalindrome(l1));
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
