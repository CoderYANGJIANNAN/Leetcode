public class Solution292 {

                public static boolean canWinNim(int n) {
                        if(n == 0) return false;
                        if(n <= 3) return true;
                        boolean[] dp = new boolean[n+1];
                        dp[0] = false;
                        dp[1] = true;
                        dp[2] = true;
                        dp[3] = true;
                        for(int i = 4;i<=n;i++){
                           dp[i] = (dp[i-1]==false)||(dp[i-2]==false)||(dp[i-3]==false);
                        }
                        return dp[n];
                }

                public static void main(String[] args) {
                    int n = 4;
                    System.out.println(canWinNim(n));
                }
}
/*
    Standard solution
    return n%4 != 0;
 */