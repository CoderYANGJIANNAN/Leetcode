import java.util.Map;
import java.util.TreeMap;

public class Solution166 {

            public String fractionToDecimal(int numerator, int denominator) {

                        //答案为整数
                       long numeratorLong = (long) numerator;
                       long denominatorLong = (long) denominator;
                       if(numeratorLong%denominatorLong==0) return String.valueOf(numeratorLong/denominatorLong);

                       StringBuilder sb = new StringBuilder();
                       if(numeratorLong<0 ^ denominatorLong<0){
                           sb.append('-');
                       }

                       //答案为小数 -> 有限小数 无限小数

                        //整数部分
                        numeratorLong = Math.abs(numeratorLong);
                        denominatorLong = Math.abs(denominatorLong);
                        long intergerpart = numeratorLong/denominatorLong;
                        sb.append(intergerpart);
                        sb.append('.');

                        //小数部分
                        StringBuilder fractionPart = new StringBuilder();
                        Map<Long,Integer> remainderIndexMap = new TreeMap<Long, Integer>();
                        long remainder = numeratorLong % denominatorLong;
                        int index = 0;
                        while(remainder!=0 && !remainderIndexMap.containsKey(remainder)){
                            remainderIndexMap.put(remainder,index);
                            remainder*=10;
                            fractionPart.append(remainder/denominatorLong);
                            remainder%=denominatorLong;
                            index++;
                        }
                        if(remainder!=0){
                            int insertIndex = remainderIndexMap.get(remainder);
                            fractionPart.insert(insertIndex,'(');
                            fractionPart.append(')');
                        }
                        sb.append(fractionPart.toString());
                        return sb.toString();
            }

    public static void main(String[] args) {
        double a = 4; double b = 333;
        double ans = a/b ;
        System.out.println(ans);
    }
}
