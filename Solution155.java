import java.util.Stack;

public class Solution155 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Solution155() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
            stack2.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
            stack1.push(val);
            stack2.push(Math.max(stack2.peek(),val));
    }

    public void pop() {
            stack1.pop();
            stack2.pop();
    }

    public int top() {
           return stack1.peek();
    }


    public int getMin() {
           return stack2.peek();
    }


    public static void main(String[] args) {
        Solution155 s = new Solution155();
        s.push(2147483646);
        s.push(2147483646);
        s.push(2147483647);
        s.top();
        s.pop();
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.push(2147483647);
        s.top();
        s.getMin();
        s.push(-2147483648);
        s.top();
        s.getMin();
        s.pop();
        s.getMin();
    }

}
