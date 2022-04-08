public class Solution680 {

    public static boolean validPalindrome(String s) {
        if(s.length()<=0||s==null) return false;
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return judge(s,left+1,right)||judge(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean judge(String s,int l,int r){
           while(l<r){
               if(s.charAt(l)!=s.charAt(r)){
                   return false;
               }
               l++;
               r--;
           }
           return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

}


//    public static boolean validPalindrome(String s) {
//        if(s.length()<=0||s==null) return false;
//        boolean flag=true;
//        int left=0,right=s.length()-1;
//        return judge(s,left,right,flag);
//    }
//
//    public static boolean judge(String s,int l,int r,boolean flag){
//        if(l>r) return true;
//        char lc=s.charAt(l);
//        char lr=s.charAt(r);
//        if(lc!=lr&&!flag){
//            return false;
//        }
//        else if(lc!=lr&&flag){
//            flag=false;
//            return judge(s,l+1,r,flag)||judge(s,l,r-1,flag);
//        }
//        return judge(s,l+1,r-1,flag);
//    }