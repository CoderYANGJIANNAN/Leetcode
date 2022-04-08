public class Solution506 {

    public static String[] findRelativeRanks(int[] score) {
            int max = Integer.MIN_VALUE;
            for(int i=0;i<score.length;i++){
                max=score[i]>max?score[i]:max;
            }
            int[] num_index = new int[max+1];//此时新数组的索引代表名词，值代表对应原数组中该名词所在的索引
            for(int j=0;j<num_index.length;j++){
                num_index[j]=-1;
            }
            for(int k=0;k<score.length;k++){
                num_index[score[k]] = k;
            }
            int rank=3,rankplus=3;
            String[] res = new String[score.length];
            for(int m=num_index.length-1;m>=0;m--){
                if(num_index[m]>=0 && rank>0){
                    if(rank==3) res[num_index[m]]="Gold Medal";
                    else if(rank==2) res[num_index[m]]="Silver Medal";
                    else if(rank==1) res[num_index[m]]="Bronze Medal";
                    --rank;
                }else if(num_index[m]>=0){
                    res[num_index[m]]=String.valueOf(++rankplus);
                }
            }
            return res;
    }

    public static void main(String[] args) {
        int[] a ={10,3,8,9,4};
        String[] res = findRelativeRanks(a);
        for(String  b: res){
            System.out.println(b);
        }
    }

}
