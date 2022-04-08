import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Solution1005 {

    public static int largestSumAfterKNegations(int[] nums, int k) {
        nums= IntStream.of(nums).boxed().sorted(((o1, o2) -> Math.abs(o2)-Math.abs(o1))).mapToInt(Integer::intValue).toArray();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0&&k>0){
                nums[i]=-nums[i];
                --k;
            }
        }
        if(k%2==1) nums[len-1]=-nums[len-1];
        return Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        int[] nums={4,2,3};
        int k=1;
        System.out.println(largestSumAfterKNegations(nums,k));
    }

}
