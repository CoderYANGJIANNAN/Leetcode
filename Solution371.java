public class Solution371 {


    public static int getSum(int a, int b) {
                while(b != 0){
                   int carry = (a&b)<<1;
                    a = a^b;
                    b = carry;
                }
                return a;
    }

    public static void main(String[] args) {
         int a = -100,b = 82;
         System.out.println(getSum(a,b));
    }
}
