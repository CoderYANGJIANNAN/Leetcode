import java.util.HashMap;
import java.util.Map;

public class Solution105 {

    private Map<Integer,Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<=0 || preorder == null) return null;
        int N = inorder.length;
        for(int i=0;i<inorder.length;i++){
            indexMap.put(inorder[i],i);
        }
        return buildTree(preorder,inorder,0,N-1,0,N-1);
    }

    public TreeNode buildTree(int[] preorder,int[] inorder,int pre_left,int pre_right,int in_left,int in_right) {
            if(pre_left>pre_right) return null;
            int pre_root_index = pre_left;
            int in_root_index = indexMap.get(preorder[pre_root_index]);
            int size_left_subtree = in_root_index - in_left;
            TreeNode root = new TreeNode(preorder[pre_root_index]);
            root.left = buildTree(preorder,inorder,pre_left+1,pre_left+size_left_subtree,in_left,in_root_index-1);
            root.right = buildTree(preorder,inorder,pre_left+size_left_subtree+1,pre_right,in_root_index+1,in_right);
            return root;
    }
}
