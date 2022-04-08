import java.util.ArrayList;
import java.util.Random;

public class Solution382 {


    ArrayList<Integer> arrayList;
    int[] arr = null;
    public Solution382(ListNode head) {
        arrayList = new ArrayList<>();
        while(head!=null){
            arrayList.add(head.val);
            head = head.next;
        }
        arr = arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public int getRandom() {
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    }

}



//    private int[] arr = null;
//    public Solution(ListNode head) {
//        ListNode cur = head;
//        while(cur!=null){
//            size++;
//            cur = cur.next;
//        }
//        arr = new int[size];
//        while(head!=null){
//            arr[i++] = head.val;
//            head=head.next;
//        }
//    }
//
//    public int getRandom() {
//        int rnd = new Random().nextInt(arr.length);
//        return arr[rnd];
//    }