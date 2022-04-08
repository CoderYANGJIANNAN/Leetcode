import java.util.Stack;

public class Solution678 {

        public static boolean checkValidString(String s) {
                if(s == null||s.length()<=0) return true;
                Stack<Integer> stack1 = new Stack<Integer>();
                Stack<Integer> stack2 = new Stack<>();
                char[] arrs = s.toCharArray();
                int N = arrs.length;
                for(int i = 0;i<N;i++){
                        if(arrs[i] == '(') stack1.push(i);
                        else if(arrs[i] == '*') stack2.push(i);
                        else{
                                if(!stack1.isEmpty()){
                                        stack1.pop();
                                }
                                else if(!stack2.isEmpty()){
                                        stack2.pop();
                                }
                                else {
                                        return false;//两栈均为空
                                }
                        }
                }
                while(!stack1.isEmpty()&&!stack2.isEmpty()){
                        int IndexOfLeft = stack1.pop();
                        int IndexOfStar = stack2.pop();
                        if(IndexOfLeft>IndexOfStar) return false;
                }
                return stack1.isEmpty();
        }

        public static void main(String[] args) {
                String s1 = "()";
                String s2 = "";
                String s3 = " ";
                String s4 = "())";
                String s5 = "*()";
                String s6 = "*";
                String s7 = "((**";
                System.out.println(checkValidString(s7));
        }

}
