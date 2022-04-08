import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution187 {

            public static List<String> findRepeatedDnaSequences(String s) {
                    if(s == null || s.length()<=0) return null;
                    List<String> res = new ArrayList<>();
                    HashMap<String,Integer> map = new HashMap<>();
                    int i = 0;
                    while(i+10<=s.length()){
                        String temp = s.substring(i,i+10);
                        int cur = map.getOrDefault(temp,0);
                        if(cur == 1) res.add(temp);
                        map.put(temp,cur+1);
                        i++;
                    }
                    return res;
            }

            public static void main(String[] args) {
                String s = "ABBABABABABBAABABBABABABABAABABAB";
                System.out.println(findRepeatedDnaSequences(s));
            }

}


//    public static List<String> findRepeatedDnaSequences(String s) {
//        if(s == null || s.length()<=0) return null;
//        List<String> res = new ArrayList<>();
//        HashMap<String,Integer> map = new HashMap<>();
//        int i = 0;
//        while(i+10<=s.length()){
//            String temp = s.substring(i,i+10);
//            if(map.containsKey(temp)){
//                map.put(temp,map.get(temp)+1);
//            }
//            else {
//                map.put(temp,1);
//            }
//            i++;
//        }
//        for(String key : map.keySet()){
//            if(map.get(key)>1){
//                res.add(key);
//            }
//        }
//        return res;
//}