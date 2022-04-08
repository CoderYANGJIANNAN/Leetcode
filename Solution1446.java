public class Solution1446 {

    public static int maxPower(String s) {
        if(s==null||s.length()<=0) return 0;
        int n=s.length()-1,length=1,max=1;
        for(int i=0;i<n;i++){
            char front = s.charAt(i);
            char back = s.charAt(i+1);
            length=front==back?++length:1;
            max=length>max?length:max;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("triplepillooooow"));
    }

}
