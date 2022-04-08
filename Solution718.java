public class Solution718 {

            public static int findLength(int[] nums1, int[] nums2) {
                if(nums1 == null && nums2 == null) return 0;
                if(nums1 == null) return nums2.length;
                if(nums2 == null) return nums1.length;

                int[][] dp = new int[nums1.length+1][nums2.length+1];
                dp[0][0] = 0;
                int res = 0;
                for(int i = 1;i<=nums1.length;i++){
                    for(int j = 1;j<=nums2.length;j++ ){
                        if(nums1[i-1] == nums2[j-1]){
                            dp[i][j] = dp[i-1][j-1] + 1;
                        }
                        if(res<dp[i][j])  res = dp[i][j];
                    }
                }
                return res;
            }

            public static void main(String[] args) {
                int[] nums1 = {3,2,1};
                int[] nums2 = {1,2,3};
                System.out.println(findLength(nums1,nums2));
            }
}
