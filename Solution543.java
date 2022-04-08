public class Solution543 {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root.left == null && root.right == null) return 0;
        int leftSize = root.left == null?0:dfs(root.left)+1;
        int rightSize = root.right == null?0:dfs(root.right)+1;//每一轮的leftSize和rightSize都是从0重新开始计算
        max = Math.max(max,leftSize+rightSize);
        return Math.max(leftSize,rightSize);//从本层节点向上个节点传的值,把当前左右子树最大的边给传上去
    }


}
