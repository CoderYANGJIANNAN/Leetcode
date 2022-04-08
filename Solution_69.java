public class Solution_69 {
    public int mySqrt(int x) {
        long left = 1,right = x,ans = 0;
        while(left<=right){
            long mid = left + (right-left)/2;
            if(mid*mid>x){
                right = mid-1;
            }
            else {
                left = mid+1;
                ans = mid;
            }
        }
        return (int)ans;
    }
}
