import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution911 {

    TreeMap<Integer,Integer> curMaxID= new TreeMap<>();
    Map<Integer,Integer> map=new HashMap<>();
    public Solution911(int[] persons, int[] times){
            int maxPollID=-1;
            for(int i=0;i< persons.length;i++){
                int cnt=map.getOrDefault(persons[i],0)+1;
                map.put(persons[i],cnt);
                int curmax=map.getOrDefault(maxPollID,0);
                if(curmax<=cnt){
                    maxPollID=persons[i];
                }
                curMaxID.put(times[i],maxPollID);
            }
    }

    public int q(int t) {
        return curMaxID.floorEntry(t).getValue();
    }

    public static void main(String[] args) {
        int[] a=new int[]{0,1,1,0,0,1,0};
        int[] b=new int[]{0,5,10,15,20,25,30};
        Solution911 solution=new Solution911(a,b);
        System.out.println(solution.q(8));
    }

}
