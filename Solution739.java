import java.util.ArrayDeque;
import java.util.Deque;

public class Solution739 {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
             while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                 res[stack.peek()]=i-stack.peek();
                 stack.pop();
             }
             stack.push(i);
        }
        return res;
    }

}


//        int[] res=new int[temperatures.length];
//        res[temperatures.length-1]=0;
//                for(int i=temperatures.length-2;i>=0;i--){
//                for(int j=i+1;j<temperatures.length;j+=res[j]){
//        if(temperatures[i]<temperatures[j]){
//        res[i]=j-i;
//        break;
//        }
//        else if(res[j]==0){
//        res[i]=0;
//        break;
//        }
//        }
//        }
//        return res;