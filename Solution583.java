public class Solution583 {
    public static int minDistance(String word1, String word2) {
             if(word1 == null && word2 == null) return 0;
             if(word1 == null) return word2.length();
             if(word2 == null) return word1.length();
             char[] s1 = word1.toCharArray();
             char[] s2 = word2.toCharArray();
             int[][] dp = new int[word1.length()+1][word2.length()+1];
             dp[0][0] = 0;
             for(int i = 1;i<=s1.length;i++){
                 for(int j = 1;j<=s2.length;j++){
                     if(s1[i-1] == s2[j-1]){
                         dp[i][j] = dp[i-1][j-1] + 1;
                     }
                     else{
                         dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                     }
                 }
             }
             return s1.length + s2.length - 2*dp[s1.length][s2.length] ;
    }

                public static void main(String[] args) {
                    String s1 = "eat";
                    String s2 = "sea";
                    System.out.println(minDistance(s1,s2));
                }
}
