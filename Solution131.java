import java.util.LinkedList;
import java.util.List;

public class Solution131 {

            public static List<List<String>> partition(String s) {
                    List<List<String>> list = new LinkedList<>();
                    List<String> l = new LinkedList<>();
                    backtrace(list,l,s,0);
                    return list;
            }

            public static void backtrace(List<List<String>> list,List<String> l,String s,int startIndex){

                    if(startIndex==s.length()){
                        list.add(new LinkedList<>(l));
                        return;
                    }
                    for(int i = startIndex;i<s.length();i++) {
                       if (isPalindrome(s, startIndex, i)){
                           String str = s.substring(startIndex,i+1);
                           l.add(str);
                       } else {
                           continue;
                       }
                       backtrace(list,l,s,i+1);
                       l.remove(l.size()-1);
                   }
            }

            public static boolean isPalindrome(String str,int start,int end){
                char[] ch = str.toCharArray();
                int i = start;
                int j = end;
                while(i<j){
                    if(ch[i]!=ch[j]) return false;
                    i++;
                    j--;
                }
                return true;
            }

            public static void main(String[] args) {
                System.out.println(partition("aab"));
            }
}
