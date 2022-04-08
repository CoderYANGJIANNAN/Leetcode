public class Solution416 {

    public static boolean canPartition(int[] nums) {
            if(nums==null) return false;
            if(nums.length<2) return false;
            int sum=0,max=Integer.MIN_VALUE;
            for(int num:nums){
                sum+=num;
                max=Math.max(num,max);
            }
            if(sum%2!=0) return false;
            int target=sum/2;
            if(max>target) return false;
            boolean[][] dp=new boolean[nums.length][target+1];
            //Initialize the array;
            dp[0][nums[0]]=true;
            for(int m=0;m<nums.length;m++){
                dp[m][0]=true;
            }
            for(int i=1;i<nums.length;i++){
                for(int j=1;j<=target;j++){
                    if(nums[i]>j) dp[i][j]=dp[i-1][j];
                    else if(nums[i]<=j){
                        dp[i][j]=dp[i-1][j-nums[i]]|dp[i-1][j];
                    }
                }
            }
            return dp[nums.length-1][target];
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,5};
        System.out.println(canPartition(nums));
    }

}
