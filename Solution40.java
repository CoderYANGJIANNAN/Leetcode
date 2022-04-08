import java.util.*;

public class Solution40 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
                if(candidates == null || candidates.length <= 0) return new LinkedList<>();
                List<Integer> l = new LinkedList<>();
                List<List<Integer>> list = new LinkedList<>();
                Arrays.sort(candidates);
                boolean[] used = new boolean[candidates.length];
                backtrace(list,l,candidates,target,0,used);
                return list;
    }

    public static void backtrace(List<List<Integer>> list,List<Integer> l,int[] candidates,int target,int startIndex,boolean[] used){
                if(target<=0){
                    if(target == 0){
                        list.add(new LinkedList<>(l));
                    }
                    return;
                }
                for(int i = startIndex;i<candidates.length && target - candidates[i]>=0;i++){
                    if(i>0 && candidates[i] == candidates[i-1] && used[i-1] == false) continue;
                    target-=candidates[i];
                    used[i] = true;
                    l.add(candidates[i]);
                    backtrace(list,l,candidates,target,i+1,used);
                    target+=candidates[i];
                    used[i] = false;
                    l.remove(l.size()-1);
                }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates,target));
    }

}
