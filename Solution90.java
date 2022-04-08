import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution90 {

    public static List<List<Integer>> subsets(int[] nums) {
            if(nums == null || nums.length<=0) return new LinkedList<>();
            List<Integer> l = new LinkedList<>();
            List<List<Integer>> list = new LinkedList<>();
            Arrays.sort(nums);
            boolean[] visited = new boolean[nums.length];
            backtrace(nums,list,l,0,visited);
            return list;
    }

    public static void backtrace(int[] nums,List<List<Integer>> list,List<Integer> l,int startIndex,boolean[] visited){
                list.add(new LinkedList<>(l));
                if(nums.length == startIndex){
                    return;
                }
                for(int i = startIndex;i<nums.length;i++){
                    if(i>0 && nums[i-1] == nums[i] && visited[i-1] == false) continue;
                    l.add(nums[i]);
                    visited[i] = true;
                    backtrace(nums,list,l,i+1,visited);
                    visited[i] = false;
                    l.remove(l.size()-1);
                }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subsets(nums));
    }

}


//    public static List<List<Integer>> subsets(int[] nums) {
//        if(nums == null || nums.length<=0) return new LinkedList<>();
//        Arrays.sort(nums);
//        List<Integer> l = new LinkedList<>();
//        List<List<Integer>> list = new LinkedList<>();
//        boolean[] visited = new boolean[nums.length];
//        backtrace(nums,list,l,0,visited);
//        return list;
//    }
//
//    public static void backtrace(int[] nums,List<List<Integer>> list,List<Integer> l,int startIndex,boolean[] visited){
//        list.add(new LinkedList<>(l));
//        if(nums.length == startIndex){
//            return;
//        }
//        for(int i = startIndex;i<nums.length;i++){
//            if(i > 0 && nums[i] == nums[i-1] && visited[i-1] == false) continue;
//            l.add(nums[i]);
//            visited[i] = true;
//            backtrace(nums,list,l,i+1,visited);
//            visited[i] = false;
//            l.remove(l.size()-1);
//        }
//    }
