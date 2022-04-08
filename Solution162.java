public class Solution162 {

            public static int findPeakElement(int[] nums) {
                    if(nums == null || nums.length<=0) return 0;
                    int left = 0;
                    int right = nums.length - 1;
                    while(left<right){
                        int mid = left + (right - left)/2;
                        if(nums[mid+1]>nums[mid]){
                            left = mid+1;
                        }
                        else{
                            right = mid;
                        }
                    }
                    return left;
            }

            public static void main(String[] args) {
                int[] nums1 = {1,2,3,1};
                int[] nums2 = {1,2,1,3,5,6,4};
                System.out.println(findPeakElement(nums1));
            }
}
