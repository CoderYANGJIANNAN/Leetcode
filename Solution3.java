import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()<=0) return 0;
        Map<Character,Integer> indexMap = new HashMap<>();
        int max = 0,l = 0;
        for(int i = 0;i<s.length();i++){
            char t = s.charAt(i);
            if(indexMap.containsKey(t)){
                l = Math.max(l,indexMap.get(t)+1);
            }
            max = Math.max(max,i-l+1);
            indexMap.put(t,i);
        }
        return max;
    }

    public static void main(String[] args) {
        String a = "bbbbbb";
        System.out.println(lengthOfLongestSubstring(a));
    }
}
