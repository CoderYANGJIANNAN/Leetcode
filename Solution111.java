public class Solution111 {

    public int minDepth(TreeNode root) {
          if(root == null) return 0;
          return helper(root);
    }

    private int helper(TreeNode root) {
        if(root.left==null && root.right==null) return 1;
        if(root.left!=null && root.right==null){
            return minDepth(root.left)+1;
        }
        if(root.right!=null && root.left==null){
            return minDepth(root.right)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

}
