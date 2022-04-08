public class Solution79 {

    public boolean exist(char[][] board, String word) {
            if(board == null || board.length<=0) return false;
            if(word == null||word.length()<=0) return true;
            int rows = board.length, columns = board[0].length;
            boolean[][] visited = new boolean[rows][columns];
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    if(searchin79(board,word,i,j,visited,0)){
                        return true;
                    }
                }
            }
            return false;
    }

    public boolean searchin79(char[][] board,String word,int i,int j,boolean[][] visited,int index){
            if(i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(index)!=board[i][j]||visited[i][j]) return false;
            if(index == word.length()-1){
                return true;
            }
             visited[i][j] = true;
             boolean result = searchin79(board,word,i+1,j,visited,index+1)
            || searchin79(board,word,i-1,j,visited,index+1)
            || searchin79(board,word,i,j+1,visited,index+1)
            || searchin79(board,word,i,j-1,visited,index+1);
             visited[i][j] = false;
             return result;
    }
}


//　　　回溯
//    private boolean find = false;
//    public boolean exist(char[][] board, String word) {
//        if(board == null || board.length<=0) return false;
//        if(word == null||word.length()<=0) return true;
//        int rows = board.length, columns = board[0].length;
//        boolean[][] visited = new boolean[rows][columns];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                if(board[i][j] == word.charAt(0)){
//                    dfs(board,visited,word,i,j,0);
//                }
//            }
//            if(find) break;
//        }
//        return find;
//    }
//
//    public void dfs(char[][] board,boolean[][] visited,String word,int i,int j,int index){
//        if(i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(index)!=board[i][j]||visited[i][j]) return;
//        if(index == word.length()-1){
//            find = true;
//            return;
//        }
//        visited[i][j] = true;
//        dfs(board,visited,word,i+1,j,index+1);
//        dfs(board,visited,word,i-1,j,index+1);
//        dfs(board,visited,word,i,j+1,index+1);
//        dfs(board,visited,word,i,j-1,index+1);
//        visited[i][j] = false;
//    }
