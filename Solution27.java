public class Solution27 {

    public static int removeElement(int[] nums, int val) {
        if(nums==null||nums.length<=0) return 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums={1};
        int val=1;
        System.out.println(removeElement(nums,val));
    }

}
