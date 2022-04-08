import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {

    public static List<Integer> findAnagrams(String s, String p) {
        if(s.length()==0||p.length()==0||s==null||p==null)return new ArrayList<>();
        char[] arrayP = p.toCharArray();
        Arrays.sort(arrayP);
        int length = p.length();
        int i = 0,j = i + length - 1;
        List<Integer> l = new ArrayList<>();
        for(;j<s.length();i++,j++){
            char[] temp = s.substring(i,j+1).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(temp,arrayP)){
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String s = "aaaaa",p="abc";
        System.out.println(findAnagrams(s,p));
    }

}
