import java.util.*;

public class Solution524_ {
    public static String findLongestWord(String s, List<String> dictionary) {
        String res="";
        for(String d:dictionary){
            int i=0,j=0;
            while(i<s.length()&&j<d.length()){
                if(s.charAt(i)==d.charAt(j)) ++j;
                ++i;
            }
            if(j==d.length()){
              if(d.length()>res.length()||(d.length()==res.length()&&d.compareTo(res)<0)){
                  res=d;
              }
            }
        }
       return res;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("zxc");
        a.add("vbn");
        System.out.println(findLongestWord("apple",a));
    }
}


//
//
//    public static String findLongestWord(String s, List<String> dictionary) {
//        int maxlength=0;
//        Map<Integer,List<String>> map = new HashMap<>();
//        for(String d:dictionary){
//            int i=0,j=0;
//            while(i<s.length()&&j<d.length()){
//                if(s.charAt(i)==d.charAt(j)) ++j;
//                ++i;
//            }
//            if(j==d.length()){
//                maxlength=j>maxlength?j:maxlength;
//                if(map.containsKey(j)){
//                    map.get(j).add(d);
//                }else {
//                    List<String> list = new LinkedList<>();
//                    list.add(d);
//                    map.put(j,list);
//                }
//            }
//        }
//        if(map.size()==0) return "";
//        List<String> res=map.get(maxlength);
//        String[] ans=res.toArray(new String[res.size()]);
//        Arrays.sort(ans);
//        return ans[0];
//    }
