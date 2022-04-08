public class Solution390 {

    public static int lastRemaining(int n) {
        int count=n,step=1,k=0;
        int lastTerm=n;
        while(count>1){
            if(k%2==0){
                lastTerm=count%2!=0?lastTerm-=step:lastTerm;
            }
            else {
                    lastTerm-=step;
            }
            step*=2;
            ++k;
            count/=2;
        }
        return lastTerm;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }

}
