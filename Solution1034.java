public class Solution1034 {

    public static int[][] colorBorder(int[][] grid, int row, int col, int color) {
        if(grid==null||grid.length<=0) return grid;
        infect(grid,row,col,grid[row][col],color);
        return grid;
    }

    public static void infect(int[][] grid,int row,int col,int origin,int color){
            if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==color||grid[row][col]!=origin){
                return;
            }
           // if(row==0||row==grid.length-1||col==0||col==grid[0].length-1||(grid[row-1][col]!=origin)||(grid[row+1][col]!=origin)||(grid[row][col-1]!=origin)||(grid[row][col+1]!=origin))
            grid[row][col]=color;
            infect(grid,row+1,col,origin,color);
            infect(grid,row-1,col,origin,color);
            infect(grid,row,col+1,origin,color);
            infect(grid,row,col-1,origin,color);
    }

    public static void main(String[] args) {
        int[][] grid={{1,1,1},{1,1,1},{1,1,1}};
        int row=0,col=1,color=3;
        int[][] res = colorBorder(grid,row,col,color);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }

}
