public class Solution1894 {

    public static int chalkReplacer(int[] chalk, int k) {
        if(chalk == null || chalk.length <= 0) return 0;
        int N = chalk.length;
        long total = 0;
        for(int num:chalk){
            total = total + num;
        }
        k%=total;
        for(int i=0;i<N;i++){
            if(chalk[i]>k){
                return i;
            }
            k -= chalk[i];
        }
        return N;
    }

    public static void main(String[] args) {
        int[] chalk1 = {5,1,5},chalk2={0,1},chalk3={9,9},chalk4 = null,chalk5 = {3,2},chalk6={0};
        int k1 = 22,k2 = 3,k3 = 2,k4=4,k5=4,k6=6;
        System.out.println(chalkReplacer(chalk1,k1));
    }

}

/*
        随便写的递归 栈溢出了

            if(chalk == null || chalk.length <= 0) return 0;
            int i = 0;
            int N = chalk.length-1;
            return function(chalk,k,i,N);


            public static int function(int[] chalk,int k,int i,int N){
                if(i>N) i = 0;
                if(k-chalk[i]<0) return i;
                return function(chalk,k-chalk[i],++i,N);
            }
 */