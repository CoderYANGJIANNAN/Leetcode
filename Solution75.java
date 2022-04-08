public class Solution75 {

    public static void sortColors(int[] nums) {
            int p0=0,p1=0,n=nums.length;
            for(int i=0;i<n;i++){
                if(nums[i]==1){
                    int temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                    ++p1;
                }else if(nums[i]==0){
                    int temp = nums[i];
                    nums[i] = nums[p0];
                    nums[p0] = temp;
                    if(p0<p1){
                        temp=nums[i];
                        nums[i]=nums[p1];
                        nums[p1]=temp;
                    }
                    ++p0;
                    ++p1;
                }

            }

    }

    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        sortColors(a);
        for(int b:a){
            System.out.println(b);
        }
    }

}


//        int red=0,white=0,blue=0;
//            for(int a:nums){
//                    if(a==0) ++red;
//                    else if(a==1) ++white;
//                    else ++blue;
//                    }
//                    for(int i=0;i<nums.length;i++){
//        if(red>0){
//        nums[i] = 0;
//        --red;
//        }
//        else if(white>0){
//        nums[i]=1;
//        --white;
//        }
//        else nums[i]=2;
//        }
