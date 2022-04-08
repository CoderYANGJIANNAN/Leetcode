public class Solution5 {

    public static String longestPalindrome(String s) {
        int lens=s.length();
        if(lens<2) return s;
        boolean[][] dp = new boolean[lens][lens];
        int begin=0,maxlength=1;

        //初始化dp数组
        for(int i=0;i<lens;i++){
            dp[i][i]=true;
        }
        char[] cur = s.toCharArray();
        for(int L=2;L<=lens;L++){
            for(int m=0;m<lens;m++){
                int j=m+L-1;
                if(j>=lens) break;
                if(cur[m]!=cur[j]){
                    dp[m][j]=false;
                }else {
                    if(j-m<3){
                        dp[m][j]=true;
                    }else {
                       dp[m][j]=dp[m+1][j-1];
                    }
                }
                if(dp[m][j]&&j-m+1>maxlength){
                    maxlength = j-m+1;
                    begin=m;
                }
            }
        }
        return s.substring(begin,begin+maxlength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));
    }

}


//    public static String longestPalindrome(String s) {
//        int windowlength=s.length();
//        while(windowlength>0){
//            for(int i=0,j=i+windowlength-1;j<s.length();i++,j++){
//                if(isPalindrome(i,j,s)){
//                    return s.substring(i,j+1);
//                }
//            }
//            --windowlength;
//        }
//        return "";
//    }
//
//    public static boolean isPalindrome(int i,int j,String s){
//        while(i<=j){
//            if(s.charAt(i)!=s.charAt(j)) return false;
//            ++i;
//            --j;
//        }
//        return true;
//    }
