public class Solution520  {

    public static boolean detectCapitalUse(String word) {
        if(word == null || word.length()<=0) return false;
        boolean isUpper = Character.isUpperCase(word.charAt(0));
        int numsOfUpper = 1;
        for(int i = 1;i<word.length();i++){
            char t = word.charAt(i);
            boolean curIsUpper = Character.isUpperCase(t);
            if(!isUpper){
                if(curIsUpper) return false;
            }else {
                if(curIsUpper) numsOfUpper++;
            }
        }
        return numsOfUpper == 1 || numsOfUpper == word.length();
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("S"));
    }
}
