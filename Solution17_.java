import java.util.LinkedList;
import java.util.List;

public class Solution17_ {

    public static List<String> letterCombinations(String digits) {
        if(digits == null||digits.length()<=0) return new LinkedList<>();
        List<String> list = new LinkedList<>();
        String[] lettermap = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder str = new StringBuilder();
        char[] d = digits.toCharArray();
        backtrace(lettermap,list,str,0,d);
        return list;
    }

    public static void backtrace(String[] lettermap,List<String> list,StringBuilder str,int i,char[] d){
        if(str.length() == d.length){
            list.add(str.toString());
            return;
        }
            int digit = d[i] - '0';
            String temp = lettermap[digit];
            char[] ch = temp.toCharArray();
            for(int j = 0;j<ch.length;j++){
                str.append(ch[j]);
                backtrace(lettermap,list,str,i+1,d);
                str.deleteCharAt(str.length()-1);
            }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}


//    public static List<String> letterCombinations(String digits) {
//        if(digits == null||digits.length()<=0) return new LinkedList<>();
//        List<String> list = new LinkedList<>();
//        String[] lettermap = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        StringBuilder str = new StringBuilder();
//        char[] d = digits.toCharArray();
//        backtrace(lettermap,list,str,0,d);
//        return list;
//    }
//
//    public static void backtrace(String[] lettermap,List<String> list,StringBuilder str,int startIndex,char[] d){
//        if(str.length() == d.length){
//            list.add(str.toString());
//            return;
//        }
//        for(int i = startIndex;i < d.length;i++){
//            String temp = lettermap[Character.getNumericValue(d[i])];
//            char[] ch = temp.toCharArray();
//            for(int j = 0;j<ch.length;j++){
//                str.append(ch[j]);
//                backtrace(lettermap,list,str,i+1,d);
//                str.deleteCharAt(str.length()-1);
//            }
//        }
//    }