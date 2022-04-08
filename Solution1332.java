public class Solution1332 {

    public static int removePalindromeSub(String s) {
             if(s.length() < 1) return 0;
             int i=0,j=s.length()-1;
             while(i<j){
                 char leftCh = s.charAt(i),rightCh = s.charAt(j);
                 if(leftCh!=rightCh) return 2;
                 i++;
                 j--;
             }
             return 1;
    }

    public static void main(String[] args) {
            String s = "abbaa";
            System.out.println(removePalindromeSub(s));
    }

}
