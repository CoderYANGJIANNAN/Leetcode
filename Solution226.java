public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        inverse(root);
        return root;
    }

    public void inverse(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode lson = root.left;
        root.left = root.right;
        root.right = lson;
        inverse(root.left);
        inverse(root.right);
    }

}
