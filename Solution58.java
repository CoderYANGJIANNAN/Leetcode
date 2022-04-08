public class Solution58 {


            public static int lengthOfLastWord(String s) {
                    if(s == null||s.length()<=0) return 0;
                    int n = s.length();
                    int j = n - 1;
                    while(j>=0&&s.charAt(j) == ' ') j--;
                    int i = j;
                    while(i>=0&&s.charAt(i) != ' ') i--;
                    return j - i;
            }

            public static void main(String[] args) {
                String s = " hello  world      ";
                String s1 = "haha";
                String s2 = "hai ke yi ";
                String s3 = null;
                System.out.println(lengthOfLastWord(s));
            }

            /*
                    去空格版

                    if(s == null||s.length()<=0) return 0;
                    s = s.trim();
                    char[] ch = s.toCharArray();
                    int N = ch.length-1;
                    int length = 0;
                    for(int i = N;i>=0;i--){
                        if(ch[i] == ' '){
                            break;
                        }
                        length++;
                    }
                    return length;
             */
}
