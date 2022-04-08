public class Solution124 {

    private int max = 0;

    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        max = root.val;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int leftValue = Math.max(dfs(root.left),0);
        int rightValue =Math.max(dfs(root.right),0);
        max = Math.max(max,rightValue+leftValue+root.val);
        return Math.max(leftValue,rightValue)+root.val;
    }

}
