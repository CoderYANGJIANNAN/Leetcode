public class Solution300 {

                public static int lengthOfLIS(int[] nums) {
                        if(nums == null||nums.length<=0) return 0;
                        int N = nums.length;
                        int[] dp = new int[N];
                        dp[0] = 1; // 截至为索引为i的元素最多有dp[i]个最长递增子序列
                        int max=-1;
                        for(int i = 1;i<N;i++){
                            dp[i] = 1;
                            for(int j = 0;j<i;j++) {
                                if (nums[i] > nums[j]) {
                                    dp[i] = Math.max(dp[i],dp[j]+1);
                                }
                            }
                            max = Math.max(max,dp[i]);
                        }
                        return max;
                }

                public static void main(String[] args) {
                    int[] nums = {10,9,2,5,3,7,101,18};
                    int[] nums1 = {0,1,0,3,2,3};
                    int[] nums2 = {1,2,1,3,3,2,5};
                    System.out.println(lengthOfLIS(nums2));
                }

}

/*

        public static int lengthOfLIS(int[] nums) {
                        if(nums == null||nums.length<=0) return 0;
                        int N = nums.length;
                        int[] dp = new int[N];
                        dp[0] = 1; // 截至为索引为i的元素最多有dp[i]个最长递增子序列
                        int max=-1;
                        for(int i = 1;i<N;i++){
                            dp[i] = 1;
                            int curmax = 0;
                            for(int j = 1;j<=i;j++) {
                                if (nums[i] > nums[i-j]) {
                                    if(curmax<dp[i-j]) curmax = dp[i-j];
                                    dp[i] = curmax + 1;
                                }
                            }
                        }
                        int res = 0;
                        for(int m = 0;m<dp.length;m++){
                            if(res<dp[m]) res = dp[m];
                        }
                        return res;

 */
