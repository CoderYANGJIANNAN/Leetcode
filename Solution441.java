public class Solution441 {

            public static int arrangeCoins(int n) {
                int i = 1;
                while(n-i>=0){
                    n = n - i;
                    i++;
                }
                return i-1;
            }

    public static void main(String[] args) {
        int n =16;
        System.out.println(arrangeCoins(n));
    }
}
