public class Solution64 {

            public static int minPathSum(int[][] grid) {
                    if( grid == null || grid.length <= 0) return 0;
                    int row = grid.length;
                    int column = grid[0].length;
                    for(int i = 1;i<row;i++){
                        grid[i][0] = grid[i][0] + grid[i-1][0];
                    }
                    for(int i = 1;i<column;i++){
                        grid[0][i] = grid[0][i] + grid[0][i-1];
                    }
                    for(int m = 1;m<row;m++){
                        for(int n = 1;n<column;n++){
                            grid[m][n] = Math.min(grid[m-1][n],grid[m][n-1]) + grid[m][n];
                        }
                    }
                    return grid[row-1][column-1];
            }

             public static void main(String[] args) {
                int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
                 System.out.println(minPathSum(grid));
             }

}
