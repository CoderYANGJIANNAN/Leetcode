import java.util.Map;
import java.util.TreeMap;

public class Solution846 {

    static TreeMap<Integer,Integer> map = new TreeMap<>();
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        for(int h : hand){
            map.put(h,map.getOrDefault(h,0)+1);
        }
            while(!map.isEmpty()){
                int temp = map.firstKey();
                int count=0;
                while (count < groupSize) {
                    if(map.get(temp)==null){
                        return false;
                    }else {
                        map.put(temp,map.get(temp)-1);
                        if(map.get(temp)==0){
                            map.remove(temp);
                        }
                    }
                    ++temp;
                    ++count;
                }
            }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,3,4,4,5,5};
        int groupSize = 3;
        System.out.println(isNStraightHand(a,groupSize));
    }

}
