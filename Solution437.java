public class Solution437 {

    private int num = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        dfs(root,targetSum);
        return num;
    }

    public void dfs(TreeNode root,int targetSum){
        if(root==null){
            return;
        }
        calnum(root,targetSum,0);
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
    }

    public void calnum(TreeNode root,int targetSum,int value){
        if(root==null)return;
        value+=root.val;
        if(targetSum==value) ++num;
        calnum(root.left,targetSum,value);
        calnum(root.right,targetSum,value);
        value-=root.val;
    }

}
