public class Solution96 {

            public static int numTrees(int n) {
                    if(n < 0) throw new IllegalArgumentException("Input error");
                    if(n == 0) return 1;
                    int[] dp = new int[n+1]; // 1- i 个 节 点 可以 组成 dp[i]种不同的二分搜索树
                    dp[0] = 1;
                    for(int i = 1;i<=n;i++){
                        for(int j = 1;j<=i;j++){
                            dp[i]+=dp[i-j]*dp[j-1];
                        }
                    }
                    return dp[n];
            }

            public static void main(String[] args) {
                int n = 3;
                System.out.println(numTrees(n));
            }
}
