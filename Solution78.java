import java.util.LinkedList;
import java.util.List;

public class Solution78 {

    public static List<List<Integer>> subsets(int[] nums) {
        if(nums == null || nums.length<=0) return new LinkedList<>();
        List<Integer> l = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        backtrace(nums,list,l,0);
        return list;
    }

    public static void backtrace(int[] nums,List<List<Integer>> list,List<Integer> l,int startIndex){
        list.add(new LinkedList<>(l));
        if(nums.length == startIndex){
            return;
        }
        for(int i = startIndex;i<nums.length;i++){
            l.add(nums[i]);
            backtrace(nums,list,l,i+1);
            l.remove(l.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
