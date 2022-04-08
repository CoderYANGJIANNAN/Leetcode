import java.util.LinkedList;
import java.util.List;

public class Solution113 {

    private List<List<Integer>> list = new LinkedList<>();
    private List<Integer> l = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return list;
        l.add(root.val);
        dfs(root,targetSum-root.val);
        return list;
    }
    public void dfs(TreeNode root, int targetSum) {
        if(root.left == null && root.right == null){
            if(targetSum == 0) {
                list.add(new LinkedList<>(l));
            }
                return;
        }
        if(root.left!=null){
            l.add(root.left.val);
            targetSum-=root.left.val;
            dfs(root.left,targetSum);
            targetSum+=root.left.val;
            l.remove(l.size()-1);
        }
        if(root.right!=null){
            l.add(root.right.val);
            targetSum-=root.right.val;
            dfs(root.right,targetSum);
            targetSum+=root.right.val;
            l.remove(l.size()-1);
        }
        return;
    }

}
