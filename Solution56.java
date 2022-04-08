import java.util.*;

public class Solution56 {

    public static int[][] merge(int[][] intervals) {
             if(intervals==null||intervals.length<=0) return new int[][]{{}};
             Arrays.sort(intervals, new Comparator<int[]>() {
                 @Override
                 public int compare(int[] o1, int[] o2) {
                     return o1[0]-o2[0];
                 }
             });
             List<int[]> merged = new ArrayList<>();
             for(int i=0;i<intervals.length;i++){
                 int L = intervals[i][0],R = intervals[i][1];
                 if(merged.size()==0||merged.get(merged.size()-1)[1]<L) merged.add(new int[]{L,R});
                 else merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],R);
             }
             int[][] res = new int[merged.size()][];
             return merged.toArray(res);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        for(int[] a:merge(intervals)){
            for(int b:a){
                System.out.println(b);
            }
        }

    }

}
