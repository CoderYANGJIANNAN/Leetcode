import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution594 {

    public static int findLHS(int[] nums) {
                if(nums==null||nums.length<=0) return 0;
                int cur=0,max=0;
                Map<Integer,Integer> map = new HashMap<>();
                for(int num:nums){
                        map.put(num,map.getOrDefault(num,0)+1);
                        }
                        for(int key:map.keySet()) {
                            if (map.containsKey(key + 1)) {
                                max = Math.max(max, map.getOrDefault(key + 1, 0) + map.get(key));
                            }
                        }
                        return max;
            }

    public static void main(String[] args) {
        int[] nums={1,2,2,2,2};
        System.out.println(findLHS(nums));
    }

}


//                int cur=0,max=0;
//                Map<Integer,Integer> map = new HashMap<>();
//                for(int num:nums){
//                        map.put(num,map.getOrDefault(num,0)+1);
//                        }
//                        for(int key:map.keySet()){
//                        if(map.containsKey(key-1)||map.containsKey(key+1)){
//                        cur = Math.max(map.getOrDefault(key-1,0),map.getOrDefault(key+1,0))+map.get(key);
//                        }
//                        max=cur>max?cur:max;
//                        }
//                        return max;