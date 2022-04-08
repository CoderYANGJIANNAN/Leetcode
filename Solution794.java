import java.util.LinkedList;
import java.util.List;

public class Solution794 {

    public boolean validTicTacToe(String[] board){
        if(!judgenum(board)) return false;
        if(judgewin(board,'X')&&judgewin(board,'O')) return false;
        if(judgewin(board,'X')&&charCount(board,'X')-charCount(board,'O')!=1) return false;
        if(judgewin(board,'O')&&charCount(board,'X')!=charCount(board,'O')) return false;
        return true;
    }

    public boolean judgenum(String[] board){
        int numsO=0,numsX=0;
        for(String b: board){
            for(int i=0;i<3;i++){
                if(b.charAt(i)=='O') ++numsO;
                else if(b.charAt(i)=='X') ++numsX;
            }
        }
        return numsX-numsO==1||numsX-numsO==0;
    }

    public int charCount(String[] board,char c){
        int count=0;
        for(int i=0;i<3;i++){
            for(char ch:board[i].toCharArray()){
                if(ch==c) count++;
            }
        }
        return count;
    }

    public boolean judgewin(String[] board,char c){
        //判断是不是c（X或者O）赢了,X赢得时候，X比O多1，反之相同
        if(board[0].charAt(0)==board[1].charAt(1)&&board[1].charAt(1)==board[2].charAt(2)&&board[2].charAt(2)==c){return true;}
        if(board[0].charAt(2)==board[1].charAt(1)&&board[1].charAt(1)==board[2].charAt(0)&&board[2].charAt(0)==c){return true;}
        for(int i=0;i<3;i++){
            if(board[i].charAt(0)==board[i].charAt(1)&&board[i].charAt(1)==board[i].charAt(2)&&board[i].charAt(2)==c){return true;}
            if(board[0].charAt(i)==board[1].charAt(i)&&board[1].charAt(i)==board[2].charAt(i)&&board[2].charAt(i)==c){return true;}
        }
        return false;
    }

}
