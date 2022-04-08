//平衡二叉树条件：左右子树均为平衡二叉树且左右子树高度差小于1

public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        ReturnNode node = helper(root);
        return node.isB;
    }

    private ReturnNode helper(TreeNode root) {
        if(root == null){
            return new ReturnNode(true,0);
        }
        ReturnNode left = helper(root.left);
        ReturnNode right = helper(root.right);
        if(!left.isB||!right.isB) return new ReturnNode(false,0);
        if(Math.abs(left.depth-right.depth)<1) return new ReturnNode(false,0);
        return new ReturnNode(true,Math.max(left.depth,right.depth)+1);
    }

}

class ReturnNode{
    boolean isB;
    int depth;

    public ReturnNode(boolean isB,int depth){
        this.isB = isB;
        this.depth = depth;
    }
}
