import java.util.Arrays;

public class Solution748 {

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        if(licensePlate==null|licensePlate.length()<=0||words.length<=0||words==null) return "";
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int sum=0;
        int[] word=new int[26];
        for(char ch:licensePlate.toLowerCase().toCharArray()){
            if(Character.isLowerCase(ch)){
                word[ch-'a']++;
                sum++;
            }
        }
        for(String s:words){
            int[] arr_=Arrays.copyOf(word,word.length);
            int sum_=0;
            char[] chs=s.toCharArray();
            for(char ch:chs){
                if(arr_[ch-'a']>0){
                    arr_[ch-'a']--;
                    sum++;
                }
                if(sum_ == sum) return s;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String licensePlate="1s3 PSt";
        String[] word = new String[]{"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord(licensePlate, word));
    }

}
