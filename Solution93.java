import java.util.LinkedList;
import java.util.List;

public class Solution93 {

    public static List<String> restoreIpAddresses(String s) {
            List<String> list = new LinkedList<>();
            StringBuilder str = new StringBuilder(s);
            backtrace(str,list,0,0);
            return list;
    }

    public static void backtrace(StringBuilder s,List<String> list,int startIndex,int pointnums){
            if(pointnums == 3){
                if(invalid(s,startIndex,s.length()-1)){
                    list.add(s.toString());
                }
                return;
            }
            for(int i = startIndex;i<s.length();i++){
                  if(invalid(s,startIndex,i)){
                      pointnums++;
                      s.insert(i+1,'.');
                      backtrace(s,list,i+2,pointnums);
                      pointnums--;
                      s.deleteCharAt(i+1);
                  }
                    else break;
            }
    }

    public static boolean invalid(StringBuilder s,int start,int end){
        if(start>end) return false;
        if(s.charAt(start) == '0' && start!=end) return false;
        int num = 0;
        for(int i = start;i<=end;i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9') return false;
            num = num * 10 + (s.charAt(i) - '0');
            if(num>255) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("25525511135"));
    }
}
