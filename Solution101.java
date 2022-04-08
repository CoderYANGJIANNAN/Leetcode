public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        return root == null? true:isSymmetric(root,root);
    }

    public boolean isSymmetric(TreeNode rootA,TreeNode rootB){
        if(rootA == null && rootB == null) return true;
        if(rootA == null || rootB == null) return false;
        if(rootA.val!=rootB.val) return false;
        return isSymmetric(rootA.left,rootB.right) && isSymmetric(rootA.right,rootB.left);
    }

}
