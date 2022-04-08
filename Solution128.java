import java.util.*;

public class Solution128 {

    public static int longestConsecutive(int[] nums) {
        if(nums==null||nums.length<=0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
        }
        int maxlongest = 1;
        for(Integer num:nums){
            int curlongest = 1;
            if(set.remove(num)){
                int cur = num;
                while(set.remove(cur-1))cur--;
                curlongest+=(num-cur);
                cur=num;
                while(set.remove(cur+1))cur++;
                curlongest+=(cur-num);
            }
            maxlongest = Math.max(curlongest,maxlongest);
        }
        return maxlongest;
    }

    public static void main(String[] args) {
        int[] a = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(a));
    }

}
