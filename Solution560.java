import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution560 {

    public static int subarraySum(int[] nums, int k) {
        if(nums==null||nums.length<=0) return 0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int N=nums.length;
        int preSum=0,count=0;
        for(int i=0;i<N;i++){
            preSum+=nums[i];
            int need = preSum-k;
            if(map.containsKey(need)){
                count+=map.get(need);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        int k=3;
        System.out.println(subarraySum(a,k));
    }

}


//
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//        int sum=0;
//        for(int j=i;j<nums.length;j++){
//        if(sum+nums[j]>=k){
//        if(sum+nums[j]==k) ++count;
//        }
//        sum+=nums[j];
//        }
//        }
//        return count;
