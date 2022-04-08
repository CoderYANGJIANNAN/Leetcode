public class Solution4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length1 = nums1.length,length2 = nums2.length;
            int left = (length1+length2+1)/2;
            int right = (length1+length2+2)/2;
            return (findKth(nums1,0,nums2,0,left)+findKth(nums1,0,nums2,0,right))/2.0;
    }
    //i: nums1的起始位置 j: nums2的起始位置
    public static int findKth(int[] nums1, int i, int[] nums2, int j, int k){
            if(i>=nums1.length) return nums2[j+k-1];
            if(j>=nums2.length) return nums1[i+k-1];
            if(k==1) return Math.min(nums1[i],nums2[j]);
            int value1 = (i+k/2-1<nums1.length)?nums1[i+k/2-1]:Integer.MAX_VALUE;
            int value2 = (j+k/2-1<nums2.length)?nums2[j+k/2-1]:Integer.MAX_VALUE;
            if(value1>value2){
                return findKth(nums1,i,nums2,j+k/2,k-k/2);
            }else {
                return findKth(nums1,i+k/2,nums2,j,k-k/2);
            }
    }

    public static void main(String[] args) {
        int[] a={1,99};
        int[] b={3,7,9,10,11,12,13};
        System.out.println(findMedianSortedArrays(a,b));
    }

}
