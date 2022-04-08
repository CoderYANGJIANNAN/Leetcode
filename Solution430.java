public class Solution430 {


//    public Node flatten(Node head) {
//        Node dummyhead = new Node();
//        dummyhead.next = head;
//        while(head!=null){
//            if(head.child==null) head = head.next;
//            else{
//                Node temp = head.next;
//                Node chead = flatten(head.child);
//                head.next = chead;
//                chead.prev = head;
//                head.child = null;
//                while(head.next!=null) head = head.next;
//                head.next = temp;
//                if(temp!=null) temp.prev = head;
//                head = temp;
//            }
//        }
//        return dummyhead.next;
//    }
}

//class Node {
//    public int val;
//    public Node prev;
//    public Node next;
//    public Node child;
//};

//public Node flatten(Node head) {
//        dfs(head);
//        return head;
//        }
//        Node dfs(Node head) {
//        Node last = head;
//        while (head != null) {
//        if (head.child == null) {
//        last = head;
//        head = head.next;
//        } else {
//        Node tmp = head.next;
//        Node childLast = dfs(head.child);
//        head.next = head.child;
//        head.child.prev = head;
//        head.child = null;
//        if (childLast != null) childLast.next = tmp;
//        if (tmp != null) tmp.prev = childLast;
//        last = head;
//        head = childLast;
//        }
//        }
//        return last;
//        }
//
