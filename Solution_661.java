public class Solution_661 {

    public static int[][] imageSmoother(int[][] img) {
        if(img == null || img.length == 0) return img;
        int row = img.length,col = img[0].length;
        int[][] res = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                int times = 0,sum = 0;
                for(int m = i-1;m<=i+1;m++) {
                    for (int n = j - 1; n <= j + 1; n++) {
                        try {
                            sum += img[m][n];
                            times++;
                        } catch (Exception e) {
                            continue;
                        }
                    }
                }
                res[i][j] = sum/times;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        int[][] smoother = imageSmoother(img);
        for(int[] s :smoother){
            for(int a :s){
                System.out.println(a);
            }
        }
    }

}
