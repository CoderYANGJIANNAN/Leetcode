public class Solution55 {

    public static boolean canJump(int[] nums) {
            int n = nums.length;
            int rightmost = 0;
            for(int i=0;i<n;i++){
                if(i<=rightmost){
                    rightmost = Math.max(rightmost,i+nums[i]);
                    if(rightmost>=n-1) return true;
                }
            }
            return false;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(canJump(nums));
    }

}


//     if(nums[0]>=nums.length-1) return true;
//             for(int i=nums.length-2;i>=0;i--){
//             if(nums[i]==0) {
//             int j=i-1;
//             for(;j>=0;j--){
//             if(nums[j]>i-j){
//             i = j;
//             break;
//             }
//             }
//             if(j<0) return false;
//        }
//        }
//        return true;
