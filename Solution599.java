import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution599 {

    public static String[] findRestaurant(String[] list1, String[] list2) {
         if(list1 == null||list2 == null||list1.length<=0||list2.length<=0) return new String[]{};
         Map<String,Integer> map = new HashMap<>();
         List<String> l = new LinkedList<>();
         int MinIndex = Integer.MAX_VALUE;
         for(int i=0;i<list2.length;i++){
             map.put(list2[i],i);
         }
         for(int i=0;i<list1.length;i++){
            String tmp = list1[i];
            if(map.containsKey(tmp)&&map.get(tmp) + i<=MinIndex){
                if((map.get(tmp)+i) < MinIndex){
                    l.clear();
                }
                MinIndex = map.get(tmp) + i;
                l.add(tmp);
            }
         }
         return l.toArray(new String[l.size()]);
    }

}
