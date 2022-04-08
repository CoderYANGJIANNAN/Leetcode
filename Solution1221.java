public class Solution1221 {
    public static int balancedStringSplit(String s) {
        if(s == null||s.length()<=0) throw new IllegalArgumentException("the String is null");
        int N = s.length(),res=0,L=0;
        for(int i = 0;i<N;i++){
            if(s.charAt(i) == 'L') L++;
            else L--;
            if(L==0) res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL"; //functional testing
        String s2 = "RLLLLRRRLR"; //functional testing
        String s3 = "RL"; //boundary value testing
        String s4 = null;//nullptr testing
        System.out.println(balancedStringSplit(s3));
    }
}
/*
        My first Solution

        int Rcounts = 0;
        int Lcounts = 0;
        int res = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='R') Rcounts++;
            else if(s.charAt(i)=='L') Lcounts++;

            if(Rcounts==Lcounts&&Rcounts!=0&&Lcounts!=0){
                res++;
                Rcounts = 0;
                Lcounts = 0;
            }
        return res;
 */