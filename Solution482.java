

public class Solution482 {

    public static String licenseKeyFormatting(String s, int k) {
        if(s == null||s.length()<=0||k<=0) return new String("");
        StringBuilder sb = new StringBuilder(s.replaceAll("-","").toUpperCase());
        for(int i = sb.length()-k;i>0;i=i-k){
            sb.insert(i,'-');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int K = 2;
        System.out.println(licenseKeyFormatting(s,K));
    }
}


//     if(s == null||s.length()<=0) return new String("");
//             StringBuilder sb = new StringBuilder();
//             char[] ch = s.toCharArray();
//             for(int i = 0;i<s.length();i++){
//        if(ch[i] != '-'){
//        sb.append(ch[i]);
//        }
//        }
//        for(int i = sb.length()-k;i>0;i=i-k){
//        sb.insert(i,'-');
//        }
//        return sb.toString().toUpperCase();