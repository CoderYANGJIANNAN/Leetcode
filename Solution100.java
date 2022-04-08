import java.util.LinkedList;
import java.util.Queue;

public class Solution100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null||q==null) return false;
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);
        while(!queue1.isEmpty()&&!queue2.isEmpty()){
            TreeNode rootp =queue1.poll();
            TreeNode rootq =queue2.poll();
            if(rootq.val!=rootp.val) return false;
            TreeNode left1=rootp.left,right1=rootp.right,left2=rootq.left,right2=rootq.right;
            if(left1==null^left2==null) return false;
            if(right1==null^right2==null) return false;
            if(left1!=null){
                queue1.offer(left1);
            }
            if(right1!=null){
                queue1.offer(right1);
            }
            if(left2!=null){
                queue2.offer(left2);
            }
            if(right2!=null){
                queue2.offer(right2);
            }
        }
        return queue1.isEmpty()&&queue2.isEmpty();
    }

}

//DFS
//            if(p==null&&q==null){
//            return true;
//            }
//            if(p==null||q==null){
//            return false;
//            }
//            if(p.val!=q.val){
//            return false;
//            }
//            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);