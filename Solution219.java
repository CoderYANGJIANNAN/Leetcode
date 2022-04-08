import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=k && i<nums.length;i++){
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],1);
        }
        for(int i=k+1;i<nums.length;i++){
            map.remove(nums[i-k-1]);
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],0);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {99,99};
        System.out.println(containsNearbyDuplicate(nums,2));
    }

}
