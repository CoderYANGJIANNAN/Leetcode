import java.util.*;

public class Solution_720 {

    public static String longestWord(String[] words) {
            if(words==null||words.length==0) return "";
            Arrays.sort(words, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length()==o2.length()){
                            return o2.compareTo(o1);
                    }
                    return o1.length() - o2.length();
                }
            });
            Set<String> set = new HashSet<>();
            for(String word:words){
                set.add(word);
            }
            for(int i=words.length-1;i>=0;i--){
                int length = words[i].length()-1;
                while(length>=0 && set.contains(words[i].substring(0,length))){
                    length--;
                }
                if(length==0) return words[i];
            }
            return "";
    }

    public static void main(String[] args) {
        String[] str = new String[]{"a","banana","app","appl","ap","apply","apple"};
        System.out.println(longestWord(str));
    }
}
