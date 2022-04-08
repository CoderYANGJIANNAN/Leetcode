public class Solution494 {

    static int count=0;

    public static int findTargetSumWays(int[] nums, int target) {
        backtrace(nums,0,target,0);
        return count;
    }

    public static void backtrace(int[] nums,int index,int target,int sum){
            if(index==nums.length){
                if(sum==target){
                    ++count;
                }
                return;
            }
            backtrace(nums,index+1,target,sum+nums[index]);
            backtrace(nums,index+1,target,sum-nums[index]);
    }

    public static void main(String[] args) {
        int[] nums={1,1};
        int target=1;
        System.out.println(findTargetSumWays(nums,target));
    }

}
