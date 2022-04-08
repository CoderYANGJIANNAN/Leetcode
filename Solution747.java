import java.util.Arrays;

public class Solution747 {

    public static int dominantIndex(int[] nums) {
        if(nums==null || nums.length<=0) throw new IllegalArgumentException("Input Error");
        if(nums.length==1) return 0;
        int max=Integer.MIN_VALUE+1,second = Integer.MIN_VALUE, index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                second = max;
                max = nums[i];
                index = i;
            }
            else if(nums[i]>second){
                second = nums[i];
            }
        }
        return second*2<=max?index:-1;
    }

    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }

}
