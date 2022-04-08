public class Solution367 {

    public static boolean isPerfectSquare(int num) {
            if(num == 0) return true;
            int sum = 1;
            while(sum<num){
                if(sum == num) return true;
                sum+=2;
            }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(0));
    }
}

//暴力
//if(num == 0) return true;
//        int i=0;
//        int temp = num;
//        do{
//        num/=10;
//        i++;
//        }while(num!=0);
//        if(i!=1) i=i%2==0?i/2:i/2+1;
//        int left = 1,right = 1;
//        for(int j=1;j<i;j++){
//        left=10*left;
//        }
//        right = 10 * left;
//        for(int m = left;m<right;m++){
//        if(m*m == temp) return true;
//        }
//        return false;