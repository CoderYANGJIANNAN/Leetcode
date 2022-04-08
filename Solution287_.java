public class Solution287_ {

    public static int findDuplicate(int[] nums) {
        if(nums==null||nums.length<=0) throw new IllegalArgumentException("Invalid Input");
        int li=1,ho=nums.length-1;
        while(li<=ho){
            int mid=li+(ho-li)/2;
            int amount=0;
            for(int num:nums){
                if(num<=mid&&num>=li) amount++;
            }
            if(li==ho){
                if(amount>1)return li;
                else break;
            }
            if(amount>mid-li+1){
                ho=mid;
            }else {
                li=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {3,1,3,4,2};
        System.out.println(findDuplicate(num));
    }

}
