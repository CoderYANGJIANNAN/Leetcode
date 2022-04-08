public class Solution26 {

    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length<=0) return 0;
        int i=0,j=1,N=nums.length;
        while(j<N){
            while(j<N&&nums[i]==nums[j]) ++j;
            if(j==N) break;
            nums[++i]=nums[j];
        }
        return i+1;
    }

    public static void main(String[] args) {
            int[] num = {0,0,1,1,1,2,2,3,3,4,4,5};
            System.out.println(removeDuplicates(num));
    }
}

//
//        if(nums==null||nums.length<=0) return 0;
//           int i=0,j=1,N=nums.length;
//           while(j<N){
//        while(j<N&&nums[i]==nums[j]) ++j;
//        if(j==N) break;
//        nums[++i]=nums[j];
//        }
//        return i+1;
