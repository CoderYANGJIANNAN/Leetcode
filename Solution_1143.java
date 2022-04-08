public class Solution_1143 {
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null && text2 == null) return 0;
        if(text1 == null) return text2.length();
        if(text2 == null) return text1.length();
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] dp = new int[t1.length+1][t2.length+1];
        dp[0][0] = 0;
        for(int i = 1;i<=t1.length;i++){
            for(int j = 1;j<=t2.length;j++){
                if(t1[i-1] == t2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[t1.length][t2.length];
    }

    public static void main(String[] args) {
        String s1 = "ace";
        String s2 = "abcde";
        System.out.println(longestCommonSubsequence(s1,s2));
    }
}
