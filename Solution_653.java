import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution_653 {


    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                int need = k - cur.val;
                if(set.contains(need)) return true;
                set.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
             cur = stack.pop();
             cur = cur.right;
        }
        return false;
    }

}
