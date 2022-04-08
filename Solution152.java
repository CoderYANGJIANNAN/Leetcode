public class Solution152 {

    public static int maxProduct(int[] nums) {
        if(nums==null||nums.length<=0) return 0;
        int[] dpMax = new int[nums.length];
        int[] dpMin = new int[nums.length];
        dpMax[0]=nums[0];
        dpMin[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dpMax[i] = Math.max(Math.max(dpMin[i-1]*nums[i],dpMax[i-1]*nums[i]),nums[i]);
            dpMin[i] = Math.min(Math.min(dpMin[i-1]*nums[i],dpMax[i-1]*nums[i]),nums[i]);
        }
        int ans=dpMax[0];
        for(int res:dpMax){
            ans = res>ans?res:ans;
        }
        return ans;
    }

    public static void main(String[] args) {
            int[] a = {2,3,-2,4};
            System.out.println(maxProduct(a));
    }

}


//    int max = Integer.MIN_VALUE,imax = 1,imin = 1;
//        for(int i=0;i<nums.length;i++){
//        if(nums[i]<0){
//        int tmp = imin;
//        imin = imax;
//        imax = tmp;
//        }
//        imax = Math.max(nums[i]*imax,nums[i]);
//        imin = Math.min(nums[i]*imin,nums[i]);
//        max = Math.max(max,imax);
//        }
//        return max;
