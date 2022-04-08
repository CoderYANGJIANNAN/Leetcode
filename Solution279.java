import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution279 {

    public int numSquares(int n) {
        List<Integer> l = new LinkedList<>(generateSquare(n));
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        visited[n]=true;
        queue.offer(n);
        int level=0;
        while(!queue.isEmpty()){
            ++level;
            int size=queue.size();
            while(size>0){
                int cur=queue.poll();
                for(int e:l){
                    int next=cur-e;
                    if(visited[next]){
                        continue;
                    }
                    else if(next<0){
                        break;
                    }
                    else if(next==0){
                        return level;
                    }
                    visited[next]=true;
                    queue.add(next);
                }
                size--;
            }
        }
        return level;
    }

    public List<Integer> generateSquare(int n){
            List<Integer> list=new LinkedList<>();
            int square=1,diff=3;
            while(square<=n){
                list.add(square);
                square+=diff;
                diff+=2;
            }
            return list;
    }
}
