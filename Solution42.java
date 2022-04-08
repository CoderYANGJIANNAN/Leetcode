import java.util.ArrayDeque;
import java.util.Deque;

public class Solution42 {

    public static int trap(int[] height) {
        int ans=0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<height.length;i++){
            while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                int top=stack.pop();
                if(stack.isEmpty()) break;
                int left=stack.peek();
                int areaheight=Math.min(height[left],height[i])-height[top];
                int areawidth=i-left-1;
                int area=areaheight*areawidth;
                ans+=area;
            }
            stack.push(i);
        }
        return ans;
    }



    public static void main(String[] args) {
       int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
