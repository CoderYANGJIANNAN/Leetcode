import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {

    public List<List<Integer>> levelOrder(Node root) {
            if(root == null) return new LinkedList<>();
            List<List<Integer>> result = new LinkedList<>();
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                List<Integer> list = new LinkedList<>();
                while(size>0) {
                    Node cur = queue.poll();
                    list.add(cur.val);
                    for(Node node : cur.children){
                        if(node!=null){
                            queue.offer(node);
                        }
                    }
                    size--;
                }
                result.add(list);
            }
            return result;
    }

}
