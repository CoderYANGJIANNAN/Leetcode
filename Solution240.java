public class Solution240 {

    public static boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length-1,columns = matrix[0].length-1;
            int row = matrix.length-1 , column = 0;
             if(matrix!=null && rows>=0 && columns>=0){
                 while(row>=0&&column<=columns){
                        if(matrix[row][column] == target){
                            return true;
                        }
                        else if(matrix[row][column] > target){
                            row--;
                        }
                        else {
                            column++;
                        }
                 }
             }
             return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2}};
        int target = 2;
        System.out.println(searchMatrix(matrix, target));
    }
}
