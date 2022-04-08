import java.util.LinkedList;
import java.util.List;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        backtrace(list,root);
        return list;
    }
    public void backtrace(List<Integer> list,TreeNode root){
        if(root == null){
            return;
        }
        backtrace(list,root.left);
        list.add(root.val);
        backtrace(list,root.right);
    }
}
