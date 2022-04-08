import java.util.*;

public class Solution884 {

    public static String[] uncommonFromSentences(String s1, String s2) {
        if(s1.length()<=0 || s2.length()<=0 || s1 == null || s2 == null) return new String[0];
        String newString = s1+" "+s2;
        String[] array = newString.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String str : array){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<String> list = new LinkedList<>();
        for(String key :map.keySet()){
            if(map.get(key)==1){
                list.add(key);
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";
        String[] strings = uncommonFromSentences(s1, s2);
        for(String s :strings){
            System.out.println(s);
        }
    }

}
