public class Solution33 {
    public static int search33(int[] nums,int target){
            int peakIndex = findPeak(nums);
            int leftPart = findTarget(nums,0,peakIndex,target),rightPart = findTarget(nums,peakIndex+1,nums.length-1,target);
            if(leftPart==-1&&rightPart==-1) return -1;
            else if(leftPart==-1) return rightPart;
            else return leftPart;
    }

    public static int findPeak(int[] nums){
            int lo=0,hi=nums.length-1;
            while(lo<hi){
                int leftValue = nums[lo],rightValue = nums[hi];
                int mid = lo + (hi-lo)/2;
                int midValue = nums[mid];
                if(midValue<=leftValue){
                    hi = mid;
                }else {
                    lo = mid;
                }
            }
            return hi;
    }

    public static int findTarget(int[] nums,int i,int j,int target){
        while(i<=j){
            int mid = i + (j-i)/2;
            int midValue = nums[mid];
            if(midValue<target){
                i = mid+1;
            }else if(midValue>target) {
                j = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={};
        int target = 4;
        System.out.println(search33(nums,target));
    }
}
