import java.util.*;

public class Solution207 {

    List<List<Integer>> list;
    int[] visited;
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
            list = new ArrayList<>();
            visited = new int[numCourses];
            for(int i=0;i<numCourses;i++){
                list.add(new ArrayList<>());
            }
            for(int[] info : prerequisites){
                list.get(info[1]).add(info[0]);
            }
            for(int j=0;j<numCourses;j++){
                if(visited[j] == 0){
                    dfs(j);
                }
            }
            return valid;
    }

    public void dfs(int u){
        visited[u] = 1;
        for(int v : list.get(u)){
            if(visited[v] == 0){
                dfs(v);
                if(!valid){
                    return;
                }
            }else if(visited[v] == 1){
                valid = false;
                return;
            }
        }
        visited[u] = 2;
    }

}
