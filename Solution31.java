import java.util.Arrays;

public class Solution31 {
    public static void nextPermutation(int[] nums) {
            if(nums==null||nums.length<=0) return;
            int i=nums.length-2;
            for(;i>=0;i--){
                    if(nums[i]<nums[i+1]){
                        int min=Integer.MAX_VALUE,index=nums.length-1;
                        for(int j=i+1;j<nums.length;j++){
                            if(min>nums[j]-nums[i] && nums[j]>nums[i]){
                                index=j;
                            }
                        }
                        int temp=nums[index];
                        nums[index]=nums[i];
                        nums[i]=temp;
                        break;
                    }
            }
            Arrays.sort(nums,i+1,nums.length);
    }
    public static void main(String[] args) {
        int[] nums={5,1,1};
        nextPermutation(nums);
        for(int num:nums){
            System.out.println(num);
        }
    }
}
