public class Solution11 {
    public static int maxArea(int[] height) {
        if(height == null || height.length<=0) return 0;
        int i = 0,j = height.length-1,max = 0;
        while(i<j){
            int area = (j-i)*Math.min(height[i],height[j]);
            max=area>max?area:max;
            if(height[i]<=height[j]) ++i;
            else --j;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {4,4,4,4,4};
        System.out.println(maxArea(a));
    }
}
