public class Solution238 {

    public static int[] productExceptSelf(int[] nums) {
        if(nums==null||nums.length<=0) return new int[]{};
        int sumleft=nums[0],sumright=nums[nums.length-1];
        int[] res = new int[nums.length];
        res[0]=1;res[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
             res[i]=sumleft;
             sumleft*=nums[i];
        }
        for(int j=nums.length-2;j>=0;j--){
             res[j]=sumright*res[j];
             sumright*=nums[j];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={1,3,2,1,2};
        int[] b=productExceptSelf(a);
        for(int c:b){
            System.out.println(c);
        }
    }

}
