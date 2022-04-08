public class Solution434 {

    public static int countSegments(String s) {
        s = s.trim();
        if(s == null||s.length()<=0) return 0;
        int countOfSpace = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1)!=' '){
                countOfSpace++;
            }
        }
        return countOfSpace+1;
    }

    public static void main(String[] args) {
        String s = " a my name     is  jack    dawd,   ";
        System.out.println(countSegments(s));
    }
}
