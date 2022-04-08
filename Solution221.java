public class Solution221 {

    public static int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length<=0) return 0;
        int area=0,sideLength=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                while(isSquare(matrix,i,j,sideLength)){
                    area=(sideLength+1)*(sideLength+1);
                    ++sideLength;
                }
            }
        }
        return area;
    }

    public static boolean isSquare(char[][] matrix,int i,int j,int sideLength){
        int numsOfone=0;
        for(int m=i;m<=i+sideLength&&m<matrix.length ;m++){
            for(int n=j;n<=j+sideLength&&n<matrix[0].length;n++){
                if(matrix[m][n]=='1')numsOfone++;
            }
        }
        if(numsOfone==(sideLength+1)*(sideLength+1)) return true;
        return false;
    }

    public static void main(String[] args) {
        char[][] matrix={{'1'}};
        System.out.println(maximalSquare(matrix));
    }


}
