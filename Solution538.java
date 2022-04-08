public class Solution538 {

    private int pre = 0;
    public TreeNode convertBST(TreeNode root) {
        TreeNode res = root;
        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode root){
            if(root == null) return;
            inOrder(root.right);
            root.val = root.val + pre;
            pre = root.val;
            inOrder(root.left);
    }

}
