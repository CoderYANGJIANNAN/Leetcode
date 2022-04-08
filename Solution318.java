public class Solution318 {

    public int maxProduct(String[] words) {
            int[] mask = new int[words.length];
            int max = 0;
            for(int i=0;i<words.length;i++){
                String t = words[i];
                for(int j=0;j<t.length();j++){
                    mask[i]|=1<<(t.charAt(j)-'a');
                }
            }
            for(int m=0;m<words.length;m++){
                for(int n=m+1;n<words.length;n++){
                    if((mask[m]&mask[n])==0){
                        max = Math.max(max,words[m].length()*words[n].length());
                    }
                }
            }
            return max;
    }

}
