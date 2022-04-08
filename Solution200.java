public class Solution200 {

    public int numIslands(char[][] grid) {
            if(grid==null||grid.length<=0) return 0;
            int rows = grid.length,column = grid[0].length;
            int island=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<column;j++){
                    if(grid[i][j] == '1'){
                      infect(grid,i,j);
                      ++island;
                    }
                }
            }
            return island;
    }

    public void infect(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='2'||grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '2';
        infect(grid,i+1,j);
        infect(grid,i-1,j);
        infect(grid,i,j+1);
        infect(grid,i,j-1);
    }

}
