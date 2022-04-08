public class Test_LinkedList {

    public int[] array;
    public Test_LinkedList(int[] arr){
        array = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            array[i] = arr[i];
        }
    }

    public Test_LinkedList(){

    }
    public ListNode Create(int[] array){
        if(array.length == 0) return null;
        ListNode head = new ListNode(array[0]);
        ListNode node = head;
        for(int i=1;i<array.length;i++){
            node.next = new ListNode(array[i]);
            node = node.next;
        }
        return head;
    }

    public String Print(ListNode head){
        if(head == null) return "null";
        StringBuilder str = new StringBuilder();
        while(head.next!=null){
            str.append(head.val+" --> ");
            head = head.next;
        }
        str.append(head.val + "--> null");
        return str.toString();
    }
}
