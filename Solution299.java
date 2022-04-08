import java.util.HashMap;

public class Solution299 {

    public static String getHint(String secret, String guess) {
        HashMap<Character,Integer> map = new HashMap<>();
        int A = 0;
        int B = 0;
        for(int i = 0;i<secret.length();i++){
                char stemp = secret.charAt(i);
                char gtemp = guess.charAt(i);
                if(stemp == gtemp){
                    A++;
                    continue;
                }
                else {
                    if (map.containsKey(stemp)) {
                        map.put(stemp, map.get(stemp) + 1);
                    } else {
                        map.put(stemp, 1);
                    }
                }
        }
        for(int j = 0;j<guess.length();j++){
            char currsecretkey = secret.charAt(j);
            char currguesskey = guess.charAt(j);
            if(currsecretkey == currguesskey) continue;
            if(!map.isEmpty()&&map.containsKey(currguesskey)){
                B++;
                map.put(currguesskey,map.get(currguesskey)-1);
                if(map.get(currguesskey) == 0) map.remove(currguesskey);
            }
        }
        return A+"A"+B+"B";
    }

    public static void main(String[] args) {
        String secret = "11";
        String guess = "10";
        System.out.println(getHint(secret, guess));
    }
}

//    int bulls = 0;
//    int[] cntS = new int[10];
//    int[] cntG = new int[10];
//        for (int i = 0; i < secret.length(); ++i) {
//        if (secret.charAt(i) == guess.charAt(i)) {
//        ++bulls;
//        } else {
//        ++cntS[secret.charAt(i) - '0'];
//        ++cntG[guess.charAt(i) - '0'];
//        }
//        }
//        int cows = 0;
//        for (int i = 0; i < 10; ++i) {
//        cows += Math.min(cntS[i], cntG[i]);
//        }
//        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
//        }
//        }
