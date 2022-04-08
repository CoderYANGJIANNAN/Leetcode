public class Solution213 {

    public static int rob(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length<2) return nums[0];
        int[] dp1 = new int[nums.length+1];
        int[] dp2 = new int[nums.length+1];
        dp1[1] = nums[0]; //偷第一家 不偷最后一家
        for(int i=2,j=1;j<nums.length-1;i++,j++){
            dp1[i] = Math.max(dp1[i-2]+nums[j],dp1[i-1]);
        }
        dp2[1] = 0;//偷最后一家,不偷第一家
        for(int i=2,j=1;j<nums.length;i++,j++){
            dp2[i] = Math.max(dp2[i-2]+nums[j],dp2[i-1]);
        }
        return Math.max(dp1[nums.length-1],dp2[nums.length]);
    }

    public static void main(String[] args) {
        int[] a = {2,3,2};
        System.out.println(rob(a));
    }

}
