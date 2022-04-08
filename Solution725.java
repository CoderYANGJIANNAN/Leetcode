import java.util.LinkedList;
import java.util.List;

public class Solution725 {

            public static ListNode[] splitListToParts(ListNode head, int k) {
                            int lengthOfhead = 0;
                            ListNode cur = head;
                            ListNode[] res = new ListNode[k];
                            while(cur!=null) {
                                lengthOfhead++;
                                cur = cur.next;
                            }
                            int part = lengthOfhead/k,remainder = lengthOfhead%k;
                            for(int i = 0;i<k&&head!=null;i++) { // 分割成k个链表
                                res[i] = head;
                                int templength = remainder > 0 ? part + 1 : part;
                                for (int j = 1; j < templength; j++) {
                                    head = head.next;
                                }
                                ListNode next = head.next;
                                head.next = null;
                                head = next;
                                if (remainder > 0) remainder--;
                            }
                            return res;
            }

                public static void main(String[] args) {
                    int[] arrs = {1,2,3,4,5,6,7,8,9,10};
                    ListNode head =  createLinkedList(arrs);
                    System.out.println(splitListToParts(head,3).toString());
              //      printLinkedList(head);
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
