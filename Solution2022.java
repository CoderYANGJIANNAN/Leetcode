public class Solution2022 {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(original==null||original.length<=0||m*n!=original.length) return new int[][]{};
        int[][] res = new int[m][n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = original[index++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
            int[] original = {1,2,3};
            int m=3,n=2;
        int[][] ints = construct2DArray(original,m,n);
        for(int[] s:ints){
            for(int a:s){
                System.out.print(a);
            }
            System.out.println();
        }
    }

}
