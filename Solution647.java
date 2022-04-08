public class Solution647 {

    public static int countSubstrings(String s) {
            int res=0;
            int n=s.length();
            boolean[][] dp=new boolean[n][n];

            for(int i=n-1;i>=0;i--){
                for(int j=i;j<n;j++){
                    if(s.charAt(i)==s.charAt(j) && ((j-i)<=2 ||dp[i+1][j-1])){
                        dp[i][j]=true;
                        ++res;
                    }
                }
            }
            return res;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}

//    static int sum=0;
//    public static int countSubstrings(String s) {
//        if(s==null||s.length()<=0) return 0;
//        for(int i=0;i<s.length();i++){
//            count(s,i,i);
//            count(s,i,i+1);
//        }
//        return sum;
//    }
//
//    public static void count(String s,int lo,int hi){
//        while(lo>=0 && hi<=s.length()-1 && s.charAt(lo) == s.charAt(hi)){
//            ++sum;
//            --lo;
//            ++hi;
//        }
//    }
