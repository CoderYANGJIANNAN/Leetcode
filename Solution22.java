import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution22 {

    public static List<String> generateParenthesis(int n) {
        if(n<=0) return null;
        List<String> list = new LinkedList<>();
        dfs("",list,0,0,n);
        return list;
    }

    public static void dfs(String s,List<String> list,int left,int right,int n){
            if(right>left||left>n){ //过滤条件
               return;
            }
            if(s.length() == 2*n){
                list.add(s);
                return;
            }
            dfs(s+"(",list,left+1,right,n);
            dfs(s+")",list,left,right+1,n);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
