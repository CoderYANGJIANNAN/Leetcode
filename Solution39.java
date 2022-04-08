import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution39 {

            public static List<List<Integer>> combinationSum(int[] candidates, int target) {
                        if(candidates == null) return new LinkedList<>();
                        int N = candidates.length;
                        List<List<Integer>> list = new LinkedList<>();
                        List<Integer> l = new LinkedList<>();
                        boolean[] visited = new boolean[candidates.length];
                        Arrays.sort(candidates);
                        dfs(candidates,target,list,l,N,0,0);
                        return list;
            }

            public static void dfs(int[] candidates,int target,List<List<Integer>> list,List<Integer> l,int N,int sum,int startIndex){

                        if(sum >= target){
                            if(sum == target){
                                list.add(new ArrayList<>(l));
                            }
                            return;
                        }

                        for(int i = startIndex;i<N && sum + candidates[i]<=target;i++){
                            sum+=candidates[i];
                            l.add(candidates[i]);
                            dfs(candidates,target,list,l,N,sum,i);
                            sum-=candidates[i];
                            l.remove(l.size()-1);
                        }
            }

                public static void main(String[] args) {
                    int[] candidate = {2,3,6,7};
                    int target = 7;
                    System.out.println(combinationSum(candidate,target));
                }
}
