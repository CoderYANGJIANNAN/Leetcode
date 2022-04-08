public class Solution700 {

    private TreeNode res = null;
    public TreeNode searchBST(TreeNode root, int val) {
        search700(root,val);
        return res;
    }

    public void search700(TreeNode root,int val){
            if(root == null){
                return;
            }
            if(root.val == val){
                res = root;
                return;
            }
            if(root.val>val){
                search700(root.left,val);
            }else {
                search700(root.right,val);
            }
    }
}
