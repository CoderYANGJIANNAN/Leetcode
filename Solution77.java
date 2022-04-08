import java.util.LinkedList;
import java.util.List;

public class Solution77 {

            List<Integer> l = new LinkedList<>();
            List<List<Integer>> list = new LinkedList<>();
            public List<List<Integer>> combine(int n, int k) {
                    if(k>n) throw new IllegalArgumentException("input error");
                    int[] nums = new int[n];
                    for(int i = 0;i<n;i++){
                        nums[i] = i + 1;
                    }
                    backtracking(nums,k,0);
                    return list;
            }

            public void backtracking(int[] nums,int k,int startIndex){
                if(l.size() == k){
                    list.add(new LinkedList<>(l));
                    return;
                }
                for(int i = startIndex;i<nums.length-l.size()+1 ;i++){
                    l.add(nums[i]);
                    backtracking(nums,k,i+1);
                    l.remove(l.size()-1);
                }
            }

            public static void main(String[] args) {
                int n=4,k=2;
                //System.out.println(combine(n,k));
            }

}
