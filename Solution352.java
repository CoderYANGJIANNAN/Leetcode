import java.util.Map;
import java.util.TreeMap;

public class Solution352 {
    TreeMap<Integer,Integer> intervals;
    public Solution352() {
        intervals = new TreeMap<>();
    }

    public void addNum(int val) {
        Map.Entry<Integer,Integer>  intervals1 = intervals.ceilingEntry(val+1);
        Map.Entry<Integer,Integer>  intervals0 = intervals.floorEntry(val);

        //第一种情况
        if(intervals0!=null && intervals1.getKey()<=val && val<=intervals0.getValue()) return;
        else if(intervals1!=null && intervals1.getKey()<=val && val<=intervals1.getValue()) return;
        else{
            boolean leftside = intervals0!=null && intervals0.getValue()+1 == val;
            boolean rightside = intervals1!=null && intervals1.getKey()-1 == val;
            //第四种情况  位于两个列表中间且距两个列表距离均为一 合成大列表
            if(leftside&&rightside){
                int left = intervals0.getKey();
                int right = intervals1.getValue();
                intervals.remove(intervals0.getKey());
                intervals.remove(intervals1.getKey());
                intervals.put(left,right);
            }
            else if(leftside){
                 intervals.put(intervals0.getKey(),val);
            }
            else if(rightside){
                intervals.put(val,intervals1.getValue());
                intervals.remove(intervals1.getKey());
            }
            else {
                intervals.put(val,val);
            }
        }
    }

    public int[][] getIntervals() {

    }

}
