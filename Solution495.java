public class Solution495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length<=0) return 0;
        int sum = duration;
        for(int i=timeSeries.length-1;i>=1;i--){
            int temp =  timeSeries[i] - timeSeries[i-1];
            if(temp>duration){
                sum+=duration;
            }else {
                sum+=temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3};
        System.out.println(findPoisonedDuration(a,3));
    }
}
