public class Solution633 {

    public static boolean judgeSquareSum(int c) {
            long sqrt=(long)Math.sqrt(c);
            long left=0,right=sqrt;
            while(left<=right){
                long cur=left*left+right*right;
                if(cur==c) return true;
                else if(cur>c) --right;
                else ++left;
            }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483600));
    }

}
