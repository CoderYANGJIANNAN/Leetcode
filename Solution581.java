public class Solution581 {

    public static int findUnsortedSubarray(int[] nums) {
        int left=0,right=nums.length-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        while(left+1<nums.length&&nums[left+1]>=max){
            max=max<nums[left]?nums[left]:max;
            ++left;
        }
        while(right-1>=0&&nums[right-1]<=min)
        {
            min=min>nums[right]?nums[right]:min;
            --right;
        }
        return left<right?right-left+1:0;
    }

    public static void main(String[] args) {
        int[] a={1,3,2,2,2};
        System.out.println(findUnsortedSubarray(a));
    }
}
