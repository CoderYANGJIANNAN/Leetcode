public class Solution709 {

    public static String toLowerCase(String s) {
        if(s==null||s.length()<=0) return "";
        StringBuilder res = new StringBuilder();
        int N=s.length();
        for(int i=0;i<N;i++){
            int ch = s.charAt(i);
            if(ch>=65&&ch<=90){
                res.append((char)(ch+32));
            }else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("LO2V3Eab4LY"));
    }

}
