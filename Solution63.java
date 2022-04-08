public class Solution63 {

                public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
                        if(obstacleGrid == null) return 0;
                        int m = obstacleGrid.length,n = obstacleGrid[0].length;
                        int[][] dp = new int[m][n];
                        for(int i = 0;i<m&&obstacleGrid[i][0] == 0;i++){
                                dp[i][0] = 1;
                        }
                        for(int j = 0;j<n&&obstacleGrid[0][j] == 0;j++){
                                dp[0][j] = 1;
                        }
                        for(int i = 1;i<m;i++){
                            for(int j = 1;j<n;j++){
                                if(obstacleGrid[i][j] == 1) continue;
                                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                            }
                        }
                        return dp[m-1][n-1];
                }

                public static void main(String[] args) {
                    int[][] arrs = {{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
                    System.out.println(uniquePathsWithObstacles(arrs));
                }

}
//     if(obstacleGrid == null) return 0;
//             int m = obstacleGrid.length,n = obstacleGrid[0].length;
//             int[][] dp = new int[m][n];
//             for(int i = 0;i<m&&obstacleGrid[i][0] == 0;i++){
//        dp[i][0] = 1;
//        }
//        for(int j = 0;j<n&&obstacleGrid[0][j] == 0;j++){
//        dp[0][j] = 1;
//        }
//        for(int i = 1;i<m;i++){
//        for(int j = 1;j<n;j++){
//        if(obstacleGrid[i][j] == 1) continue;
//        if(obstacleGrid[i][j-1] + obstacleGrid[i-1][j] == 2) dp[i][j] = 0;
//        else if(obstacleGrid[i][j-1] == 1) dp[i][j] = dp[i-1][j];
//        else if(obstacleGrid[i-1][j] == 1) dp[i][j] = dp[i][j-1];
//        else dp[i][j] = dp[i-1][j] + dp[i][j-1];
//        }
//        }
//        return dp[m-1][n-1];