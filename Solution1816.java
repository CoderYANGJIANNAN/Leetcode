public class Solution1816 {
    public static String truncateSentence(String s, int k) {
        int j=0,N=s.length();
        int count=0;
        for(;j<N&&count<k;j++){
            char c=s.charAt(j);
            if(c==' ') count++;
        }
        if(k-1==count) return s;
        return s.substring(0,j-1);
    }

    public static void main(String[] args) {
        String s="Hello awa dad fe ew EW wa es";
        int k=8;
        System.out.println(truncateSentence(s,k));
    }

}
