public class Solution807 {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
            int row=grid.length;
            int col=grid[0].length;
            int[] rowMax=new int[row];
            int[] colMax=new int[col];
            for(int i=0;i<row;i++){
                int maxHeight=Integer.MIN_VALUE;
                for(int j=0;j<col;j++){
                    maxHeight=maxHeight<grid[i][j]?grid[i][j]:maxHeight;
                }
                rowMax[i]=maxHeight;
            }

            for(int i=0;i<row;i++){
                int maxHeight=Integer.MIN_VALUE;
                for(int j=0;j<col;j++){
                    maxHeight=maxHeight<grid[j][i]?grid[j][i]:maxHeight;
                }
                colMax[i]=maxHeight;
            }

            int res=0;
            for(int i=0;i<col;i++){
                for(int j=0;j<row;j++){
                    int curMin=Math.min(rowMax[i],colMax[j]);
                    if(curMin-grid[i][j]>0){
                        res+=curMin-grid[i][j];
                    }
                }
            }
            return res;
    }

    public static void main(String[] args) {
        int[][] grid={{0,0,0},{0,0,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

}
