import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution322 {

    public static int coinChange(int[] coins, int amount) {
        if(coins==null||coins.length<=0) return -1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int coin:coins){
                if(coin<=i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

    public static void main(String[] args) {
        int[] coins={186,419,83,408};
        int target=6249;
        System.out.println(coinChange(coins,target));
    }

}
