public class Solution423 {

    public static String originalDigits(String s) {
        if(s==null||s.length()<=0) return "";
        StringBuilder res = new StringBuilder();
        int[] digits = new int[26];
        int[] cnt = new int[10];
        for(int i=0;i<s.length();i++){
            char t = s.charAt(i);
            ++digits[t-'a'];
        }

        cnt[0]  = digits['z'-'a'];
        cnt[2]  = digits['w'-'a'];
        cnt[8]  = digits['g'-'a'];
        cnt[6]  = digits['x'-'a'];
        cnt[4]  = digits['u'-'a'];
        cnt[3]  = digits['t'-'a']-cnt[2]-cnt[8];
        cnt[7] = digits['s'-'a']-cnt[6];
        cnt[1] = digits['o'-'a']-cnt[2]-cnt[0]-cnt[4];
        cnt[5]  = digits['f'-'a']-cnt[4];
        cnt[9] = digits['i'-'a']-cnt[8]-cnt[6]-cnt[5];
//        for(int i=0;i<10;i++){
//            System.out.println(cnt[i]);
//        }

        for(int i=0;i<10;i++){
            for(int j=0;j<cnt[i];j++){
                res.append((char) (i+'0'));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(originalDigits("fievoufr"));
    }
}
