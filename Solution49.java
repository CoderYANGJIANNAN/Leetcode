import java.util.*;

public class Solution49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length<=0 || strs == null) return new ArrayList<>();
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] a = {"eat","ate","vaw","vwa","bbc"};
        System.out.println(groupAnagrams(a));
    }

}
