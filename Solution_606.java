public class Solution_606 {


    public String tree2str(TreeNode root) {
            if(root==null) return "";
            if(root.left==null&&root.right==null){
              return   new StringBuilder().append(root.val).toString();
            }
            if(root.right==null){
              return   new StringBuilder().append(root.val).append("(").append(tree2str(root.left)).append(")").toString();
            }
            return   new StringBuilder().append(root.val).append("(").append(tree2str(root.left)).append(")").append("(").append(tree2str(root.right)).append(")").toString();
    }

}
