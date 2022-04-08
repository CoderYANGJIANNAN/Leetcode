public class Solution1576 {

    public static String modifyString(String s) {
        if(s==null||s.length()<=0) return "";
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char a = 'a';
            if(ch[i] == '?'){
                while((i>0&&ch[i-1]==a)||(i<s.length()-1&&ch[i+1]==a)){
                    a++;
                }
                ch[i] = a;
            }
        }
        return new String(ch);
    }


    public static void main(String[] args) {
        System.out.println(modifyString("aa?"));
    }

}
