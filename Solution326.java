public class Solution326 {

                public static boolean isPowerOfThree(int n) {
                         if(n == 1) return true;
                         if(n < 1 ||  n % 3 !=0) return false;
                         return isPowerOfThree(n/3);
                }
                public static void main(String[] args) {
                    int a = 18 ;
                    System.out.println(isPowerOfThree(a));
                }

}
//         if(n == 1) return true;
//         if(n < 1 || n == 2 || n %3 !=0) return false;
//         return isPowerOfThree(n/3);


//return n > 0 && 1162261467 % n == 0;