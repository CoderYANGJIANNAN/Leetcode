import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution46 {


            public static List<List<Integer>> permute(int[] nums) {
                    if(nums == null||nums.length<=0) return null;
                    int N = nums.length;
                    boolean[] visited = new boolean[N];
                    List<List<Integer>> list = new LinkedList<>();
                    List<Integer> l = new LinkedList<>();
                    backtraces(nums,list,l,visited,N);
                    return list;
            }

            public static void backtraces(int[] nums,List<List<Integer>> list,List<Integer> l,boolean[] visited,int N){
                            if(l.size() == nums.length){
                                list.add(new ArrayList<>(l)); // 不要忘记初始化
                                return;
                            }
                            for(int i=0;i<N;i++){
                                if(visited[i]) continue;
                                l.add(nums[i]);
                                visited[i] = true;
                                backtraces(nums,list,l,visited,N);
                                l.remove(l.size()-1);
                                visited[i] = false;
                            }
            }

            public static void main(String[] args) {
                int[] nums = {1,2,3};
                System.out.println(permute(nums));
            }

}
