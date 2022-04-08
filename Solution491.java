import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution491 {

    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> l = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        backtrace(nums,list,l,0);
        return list;
    }

    public static void backtrace(int[] nums,List<List<Integer>> list,List<Integer> l,int startIndex){
            if(l.size()>1){
                list.add(new LinkedList<>(l));
            }
       //     if(nums.length == startIndex) return;
            Set<Integer> set = new HashSet<>();
            for(int i = startIndex;i<nums.length;i++){
                if(!l.isEmpty()&&(set.contains(nums[i]) || nums[i] < l.get(l.size() - 1))) continue;
                l.add(nums[i]);
                set.add(nums[i]);
                backtrace(nums,list,l,i+1);
                l.remove(l.size()-1);
            }
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,1};
        System.out.println(findSubsequences(a));
    }

}
