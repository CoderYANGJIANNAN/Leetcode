public class Solution34 {

    public static int[] searchRange(int[] nums, int target) {
         if(nums==null||nums.length<=0) return new int[]{-1,-1};
         int lo = 0,hi = nums.length-1;
         int leftTarget = GetFirstTarget(nums,lo,hi,target);
         int rightTarget = GetLastTarget(nums,lo,hi,target);
         return new int[]{leftTarget,rightTarget};
    }

    private static int GetFirstTarget(int[] nums, int lo, int hi, int target) {
            if(lo>hi) return -1;
            int midIndex = lo + (hi-lo)/2;
            if(nums[midIndex]==target){
                if((midIndex>0&&nums[midIndex-1]!=target)||midIndex==0) return midIndex;
                else hi=midIndex-1;
            }
            else if(nums[midIndex]>target) hi=midIndex-1;
            else lo=midIndex+1;
            return GetFirstTarget(nums,lo,hi,target);
    }

    private static int GetLastTarget(int[] nums, int lo, int hi, int target) {
                if(lo>hi) return -1;
                int midIndex = lo + (hi-lo)/2;
                if(nums[midIndex]==target){
                    if((midIndex<nums.length-1&&nums[midIndex+1]!=target)||midIndex==nums.length-1) return midIndex;
                    else lo=midIndex+1;
                }
                else if(nums[midIndex]>target) hi=midIndex-1;
                else lo=midIndex+1;
                return GetLastTarget(nums,lo,hi,target);
    }

    public static void main(String[] args) {
        int[] a ={8,8,8,8};
        int[] res = searchRange(a,8);
        for(int b:res){
            System.out.println(b);
        }
    }

}
