public class Solution50 {

    public double myPow(double x, int n) {
        long N=n;
        return N>=0?quickMul(x,N):1.0/quickMul(x,-N);
    }

    public double quickMul(double x,long N){
        double contributor=x;
        double ans=1;
        while(N>0){
            if(N%2==1){
                ans*=contributor;
            }
            contributor*=contributor;
            N>>=1;
        }
        return ans;
    }

}
