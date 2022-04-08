import java.util.HashMap;
import java.util.Map;

public class Solution1189 {
    public static int maxNumberOfBalloons(String text) {
        if(text.length()<=0) return 0;
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = text.toCharArray();
        boolean flag = false;
        int count= Integer.MAX_VALUE;
        for(char c : ch){
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        if(map.containsKey('b')&&map.containsKey('a')&&map.containsKey('l')&&map.containsKey('o')&&map.containsKey('n')){
            flag = true;
        }
        if(flag){
            return Math.min(map.get('a'),Math.min(map.get('o')/2,Math.min(map.get('n'),Math.min(map.get('l')/2,map.get('b')))));
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
    }
}
