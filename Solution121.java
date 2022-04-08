public class Solution121 {

    public static int maxProfit(int[] prices) {
            if(prices == null||prices.length<=0) return 0;
            int min=prices[0];
            int res=0;
            for(int i=1;i<prices.length;i++){
                res = Math.max(prices[i]-min,res);
                if(prices[i]<min) min = prices[i];
            }
            return res;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }

}
