public class Solution383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(magazine==null||magazine.length()<=0) return false;
        if(ransomNote==null||ransomNote.length()<=0) return true;
        int[] character=new int[26];
        int N=magazine.length();
        int n=ransomNote.length();
        for(int i=0;i<N;i++){
            char t=magazine.charAt(i);
            ++character[t-'a'];
        }
        for(int j=0;j<n;j++){
            char t=ransomNote.charAt(j);
            --character[t-'a'];
            if(character[t-'a']<0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote="a";
        String magazine="b";
        System.out.println(canConstruct("aa","ab"));
    }

}
