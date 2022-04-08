import java.util.Stack;

public class Solution1614 {

    public static int maxDepth(String s) {
        if(s==null||s.length()<=0) return 0;
        char[] ch = s.toCharArray();
        int maxDepth=0,leftNum=0;
        for(char c:ch){
            if(c == '('){
                ++leftNum;
                maxDepth=Math.max(maxDepth,leftNum);
            }
            else if(c == ')'){
                --leftNum;
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("()()(())()(()())"));
    }

}
