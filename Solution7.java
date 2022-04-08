public class Solution7 {

    public static int reverse(int x) {
        long digit=1,res=0;
        int startIndex=0;
        String s = String.valueOf(x);
        if(s.charAt(0)=='-') startIndex=1;
        for(int i=startIndex;i<s.length();i++){
            int cur=s.charAt(i)-'0';
            res+=cur*digit;
            digit*=10;
        }
        if(s.charAt(0)=='-'){
            res*=-1;
        }
        return res>Integer.MAX_VALUE-1||res<Integer.MIN_VALUE?0:(int)res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }



}
//
//    public int reverse(int x) {
//        long n = 0;
//        while(x != 0) {
//            n = n*10 + x%10;
//            x = x/10;
//        }
//        return (int)n==n? (int)n:0;
//    }
