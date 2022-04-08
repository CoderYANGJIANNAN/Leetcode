import java.util.*;
public class Solution414 {

    public static int thirdMax(int[] nums) {
            if(nums.length == 1) return nums[0];
            if(nums.length == 2) return Math.max(nums[0],nums[1]);
            long a =(long) -1e18,b = (long) -1e18,c = (long) -1e18;
            for(long num : nums){
                if(num>a){
                    c = b;
                    b = a;
                    a = num;
                }
                else if(num<a && num>b){
                     c = b;
                     b = num;
                }
                else if(num<b && num>c){
                     c = num;
                }
            }
            return c!=(long) -1e18?(int) c:(int)a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-2147483648};
        System.out.println(thirdMax(arr));
    }
}

//    Set<Integer> set = new HashSet<>();
//    PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for(int num:nums){
//                set.add(num);
//                }
//                Object[] obj = set.toArray();
//                int temp[] = new int[obj.length];
//                for(int i = 0;i<obj.length;i++){
//        temp[i] = (int)obj[i];
//        }
//        int j = 0,max = temp[j];
//        if(temp.length < 3){
//        for(j = 0;j<temp.length;j++){
//        if(max<temp[j]) max = temp[j];
//        }
//        return max;
//        }
//        for(int i = 0;i < 3;i++){
//        queue.add(temp[i]);
//        }
//        for(int i = 3;i<temp.length;i++){
//        if(queue.peek()<temp[i]){
//        queue.poll();
//        queue.add(temp[i]);
//        }
//        }
//        return queue.poll();