public class Solution167 {

    public static int[] twoSum(int[] numbers, int target) {
            int left=0,right=numbers.length-1;
            while(left<right){
                int cur=numbers[left]+numbers[right];
                if(cur==target) return new int[]{left+1,right+1};
                else if(cur<target)++left;
                else if(cur>target)--right;
            }
              return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers={};
        int target=-1;
        int[] res = twoSum(numbers,target);
        for(int a:res){
            System.out.println(a);
        }
    }

}