import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution215 {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            queue.add(nums[i]);
        }
        for(int j=k;j<nums.length;j++){
            int curMin = queue.peek();
            if(nums[j]>=curMin){
                queue.poll();
                queue.add(nums[j]);
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] a={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(a,k));
    }
}
