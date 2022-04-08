import java.util.*;
/*
   数独推导当前小方块在第几个box的公式 ： (i/3)*3 + j/3
 */
public class Solution36 {

                public boolean isValidSudoku(char[][] board) {

                        HashMap<Integer,Set<Integer>> row = new HashMap<>(),col = new HashMap<>(),area = new HashMap<>();
                        for(int i = 0;i<9;i++){
                            row.put(i,new HashSet<>());
                            col.put(i,new HashSet<>());
                            area.put(i,new HashSet<>());
                        }
                        for(int i = 0;i<9;i++){
                            for(int j = 0;j<9;j++){

                                int idx = (i/3)*3 + j/3;
                                char ch = board[i][j];
                                if(ch == '.') continue;
                                int u = ch - '0'; // char 转 int
                                if(row.get(i).contains(u)||col.get(j).contains(u)||area.get(idx).contains(u)) return false;
                                row.get(i).add(u);
                                col.get(j).add(u);
                                area.get(idx).add(u);
                            }
                        }
                        return true;
                }


                public static void main(String[] args) {


                }

}

/*
            My first answer

                      Set<Character> set = new HashSet<>();

                public boolean isValidSudoku(char[][] board) {
                    if(board==null) return false;
                    //Check rows
                    for(int i = 0;i<board.length;i++) {
                        for(int j = 0;j<board[0].length;j++){
                            if(board[i][j] != '.'){
                                if(!set.add(board[i][j])) return false;
                            }
                        }
                        set.clear();
                    }
                    //Check columns

                    for(int i = 0;i<board.length;i++) {
                        for(int j = 0;j<board[0].length;j++){
                            if(board[j][i] != '.'){
                                if(!set.add(board[j][i])) return false;
                            }
                        }
                        set.clear();
                    }

                    //Check 3x3
                for(int m = 0;m<board.length;m=m+3) {
                    for(int n = 0;n<board[0].length;n=n+3) {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                if(board[i + m][j + n]!='.') {
                                    if (!set.add(board[i + m][j + n])) return false;
                                }
                                }
                        }
                        set.clear();
                    }
                }
                    return true;
 */
