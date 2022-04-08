public class Solution283 {
    public static void moveZeroes(int[] nums) {
        int numsOfzero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) ++numsOfzero;
        }
        int m=0;
        for(int n=0;n<nums.length;n++){
            if(nums[n]!=0){
                nums[m]=nums[n];
                m++;
            }
        }
        for(int k=nums.length-1;k>=nums.length-numsOfzero;k--){
            nums[k]=0;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,1,1};
        moveZeroes(a);
        for(int b:a){
            System.out.println(b);
        }
    }
}
