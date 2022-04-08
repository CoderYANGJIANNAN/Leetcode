import java.util.ArrayList;

public class Solution98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) return true;
        if (node.val >= upper || node.val <= lower) return false;
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}


//  My first answer
//    ArrayList<Integer> arrs = new ArrayList<>();
//    public boolean isValidBST(TreeNode root) {
//        inOrder(root);
//        if(arrs.size()<2) return true;
//        for(int i=1;i<arrs.size();i++){
//            if(arrs.get(i)<=arrs.get(i-1)) return false;
//        }
//        return true;
//    }
//
//    public void inOrder(TreeNode root){
//        if(root == null) return;
//        inOrder(root.left);
//        arrs.add(root.val);
//        inOrder(root.right);
//    }
