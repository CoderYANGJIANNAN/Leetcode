public class Solution223 {

    //总面积 = 两个单一面积之和减去重叠面积
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

                int area1 = (ax2 - ax1) * (ay2 - ay1);
                int area2 = (bx2 - bx1) * (by2 - by1);
                if(bx1<ax2&&ay1<by2&&bx2>ax1&&ay2>by1){
                    return area1 + area2 - Math.abs(Math.min(ax2,bx2) - Math.max(ax1,bx1))*Math.abs(Math.min(ay2,by2)-Math.max(ay1,by1));
                }
                else {
                    return area1+area2;
                }
    }

    public static void main(String[] args) {
        int ax1 = -2,ay1 = -2,ax2 = 2,ay2 =2,bx1 = -2,by1 = -2,bx2 = 2,by2 = 2;
        System.out.println(computeArea(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2));
    }

}
