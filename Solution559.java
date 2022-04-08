import java.util.List;
import java.util.Map;

public class Solution559 {

    public int dfs(NTreeNode node){
        if(node == null) return 0;
        int curmaxdepth = 0;
        List<NTreeNode> children = node.children;
        for(NTreeNode cur : children){
            int curdepth = dfs(cur);
            curmaxdepth = Math.max(curdepth,curmaxdepth);
        }
        return curmaxdepth+1;
    }

}
