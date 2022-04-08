
public class Solution507 {

    public static boolean checkPerfectNumber(int num) {
        /*
            枚举
         */
        if(num<=1) return false;
        int i=2,sum=1;
        for(;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(i*i<num){
                    sum+=num/i;
                }
            }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(8128));
    }
}
