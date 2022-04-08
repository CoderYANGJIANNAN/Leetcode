import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution229 {
    public static List<Integer> majorityElement(int[] nums) {
            if(nums == null || nums.length<=0) return new LinkedList<>();

    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}


//        Map<Integer,Integer> map = new HashMap<>();
//        List<Integer> list = new LinkedList<>();
//        int target = nums.length/3;
//            for(int i = 0;i<nums.length;i++){
//        int temp = nums[i];
//        if(!map.containsKey(temp)) map.put(temp,1);
//        else map.put(temp,map.get(temp)+1);
//        }
//        for(int key : map.keySet()){
//        if(map.get(key)>target) list.add(key);
//        }
//        return list;