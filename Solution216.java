import java.util.LinkedList;
import java.util.List;

public class Solution216 {

            public static List<List<Integer>> combinationSum3(int k, int n) {
                    List<Integer> l = new LinkedList<>();
                    List<List<Integer>> list = new LinkedList<>();
                    boolean[] visited = new boolean[n+1];
                    backtracking(k,n,l,list,0,1);
                    return list;
            }

            public static void backtracking(int k,int n,List<Integer> l,List<List<Integer>> list,int sum,int startindex){
                if(sum > n){
                    return;
                }
                if(l.size() == k){
                        if(n == sum){
                            list.add(new LinkedList<>(l));
                        }
                        return;
                    }
                    for(int i = startindex;i <= 9 - (k-l.size()) + 1;i++){
                            l.add(i);
                            sum+=i;
                            backtracking(k,n,l,list,sum,i+1);
                            l.remove(l.size()-1);
                            sum-=i;
                    }
            }

            public static void main(String[] args) {
                System.out.println(combinationSum3(3,9));
            }
}
