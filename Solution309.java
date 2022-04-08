public class Solution309 {

    public int maxProfit(int[] prices) {
            if(prices == null || prices.length<=0) return 0;
            int N = prices.length;
            int[][] dp = new int[N][3];
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            dp[0][2] = 0;
            for(int i=1;i<N;i++){
                dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2] - prices[i]);
                dp[i][1] = dp[i-1][0] + prices[i];
                dp[i][2] = Math.max(dp[i-1][1],dp[i-1][2]);
            }
            return Math.max(dp[N-1][1],dp[N-1][2]);
    }

}
