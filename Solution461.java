public class Solution461 {

    public static int hammingDistance(int x, int y) {
            int res = 0,z =x^y;
            while(z!=0){
                res+=z&1;
                z>>=1;
            }
            return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(3,1));
    }
}
