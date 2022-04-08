import java.util.Arrays;
import java.util.Comparator;

public class Solution406 {

    public static int[][] reconstructQueue(int[][] people) {
        if(people==null||people.length<=0) return new int[][]{};
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }else {
                    return o2[1]-o1[1];
                }
            }
        });
        int N=people.length;
        int[][] ans=new int[N][];
        for(int[] person:people){
            int space=person[1]+1;
            for(int i=0;i<N;i++){
                if(ans[i]==null){
                    --space;
                    if(space==0){
                        ans[i]=person;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] people={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] res=reconstructQueue(people);
        for(int[] a:res){
            for(int b:a){
                System.out.println(b);
            }
        }
    }


}


//    int[][] queue=new int[people.length][people[0].length];
//    boolean[] use=new boolean[people.length];
//        for(int i=0;i<people.length;i++){
//        int space = people[i][1];
//        for(int j=0;j<people.length;j++){
//        if(space==0&&use[j]==false){
//        queue[j][0]=people[i][0];
//        queue[j][1]=people[i][1];
//        use[j]=true;
//        break;
//        }
//        else if(use[j]==false){
//        --space;
//        }
//        }
//        }
//        return queue;
