import java.util.HashMap;
import java.util.Map;

public class Solution405 {


            public static String toHex(int num) {
                if(num == 0) return "0";
                long _num = num;
                StringBuilder str = new StringBuilder();
                if(num<0) _num = (long) Math.pow(2,32) + num;
                while(_num!=0){
                        long temp = _num % 16;
                        char c = (char)('0'+temp);
                        if(temp>=10) c = (char)(temp - 10 +'a');
                        str.append(c);
                        _num/=16;
                }
                return str.reverse().toString();
            }

            public static void main(String[] args) {
                    int a = 47;
                    System.out.println(toHex(a));
            }

}
// if (num == 0) return "0";
//         StringBuilder sb = new StringBuilder();
//         while (num != 0) {
//         int u = num & 15; // 取余操作
//         char c = (char)(u + '0');
//         if (u >= 10) c = (char)(u - 10 + 'a');
//         sb.append(c);
//         num >>>= 4;
//         }
//         return sb.reverse().toString();
