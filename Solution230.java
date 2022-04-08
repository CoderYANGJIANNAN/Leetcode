import java.util.Stack;

public class Solution230 {
                    public static int kthSmallest(TreeNode root, int k) {
                        Stack<Integer> stack = new Stack<>();
                        inOrder(root,k,stack);
                        return stack.peek();
                    }
                    public static void inOrder(TreeNode root,int k,Stack<Integer> stack){
                        if(root==null){
                            return;
                        }
                        inOrder(root.left,k,stack);
                        if(k == stack.size()){
                            return;
                        }
                        stack.push(root.val);
                        inOrder(root.right,k,stack);
                    }
}

//    public static int kthSmallest(TreeNode root, int k) {
//        ArrayList<Integer> arrs = new ArrayList<>();
//        inOrder(root,arrs);
//        return arrs.get(k-1);
//    }
//    public static void inOrder(TreeNode root,ArrayList<Integer> arrs){
//        if(root==null){
//            return;
//        }
//        inOrder(root.left,arrs);
//        arrs.add(root.val);
//        inOrder(root.right,arrs);
//    }
