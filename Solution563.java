public class Solution563 {


    private int sum;
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        postorder(root);
        return sum;
    }

    public int postorder(TreeNode root){
        if(root == null) return 0;
        int leftValue = postorder(root.left);
        int rightValue = postorder(root.right);
        sum+=Math.abs(leftValue-rightValue);
        return leftValue+rightValue+root.val;
    }
}
