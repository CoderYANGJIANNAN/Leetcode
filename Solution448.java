import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
            if(nums==null||nums.length<=0) new ArrayList<>();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]>0){
                    l.add(i+1);
                }
            }
            return l;
    }

}
