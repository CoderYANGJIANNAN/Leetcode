public class Solution268 {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = 0;
        for(int i = 1;i<=N;i++){
            sum = sum + i;
        }
        for(int n : nums){
            sum-=n;
        }
        return sum;
    }
}
