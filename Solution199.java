import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199 {

    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size=0;
        while(!queue.isEmpty()){
            size=queue.size();
            while(size>0){
                TreeNode node=queue.poll();
                size--;
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                if(size==0)  res.add(node.val);
            }
        }
        return res;
    }

}
