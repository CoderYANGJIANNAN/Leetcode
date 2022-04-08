public class Solution673 {

            public static int findNumberOfLIS(int[] nums) {
                    if(nums == null) return 0;
                    int N = nums.length;
                    int countOfmax = 1;

                    return countOfmax;
            }

            public static void main(String[] args) {
                int[] arrs1 = {1,3,5,4,7};
                int[] arrs2 = {2};
                int[] arrs3 = {3,3,3,3,3};
                int[] arrs4 = {5,4,3,2,1};
                int[] arrs5 = {5,6,6,7,8};
                System.out.println(findNumberOfLIS(arrs1));
            }

}
