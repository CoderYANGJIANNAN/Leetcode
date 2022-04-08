import java.util.ArrayList;
import java.util.List;

public class Solution139_ {
    public boolean wordBreak(String s, List<String> wordDict) {
            if(s.length()<=0||s==null||wordDict.size()<=0) return false;
            int lens=s.length();
            boolean[] dp=new boolean[lens+1];
            dp[0]=true;
            for(int i=1;i<lens;i++){
                for(int j=0;j<i;j++){
                    if(dp[j]&&wordDict.contains(s.substring(j,i))){
                        dp[i]=true;
                        break;
                    }
                }
            }
            return dp[lens];
    }

    public static void main(String[] args) {
        Solution139_ solution = new Solution139_();
        String s = "aaaaaaa";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");
        System.out.println(solution.wordBreak(s,wordDict));
    }
}
