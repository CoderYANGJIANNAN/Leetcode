public class Solution338 {

    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        int highBit=0;
        for(int i=1;i<res.length;i++){
            if((i&(i-1))==0){
                res[i]=1;
                highBit=i;
            }
            else {
              res[i]=1+res[i-highBit];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = countBits(7);
        for(int b:a){
            System.out.println(b);
        }

    }
}
