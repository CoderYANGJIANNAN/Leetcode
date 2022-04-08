public class Solution372 {
    static final int MOD = 1337;
    public static int superPow(int a, int[] b) {
        int ans=1;
        for(int i=b.length-1;i>=0;i--){
            ans=(int)((long)ans*quickMul(a,b[i])%MOD);
            a=quickMul(a,10);
        }
        return ans;
    }

    public static int quickMul(int x,int N){
        int ans=1;
        while(N>0){
            if(N%2==1){
                ans=(int)((long)ans*x%MOD);
            }
            x=(int)((long)x*x%MOD);
            N>>=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a=2; int[]b={1,2,3};
        superPow(a,b);
    }
}
