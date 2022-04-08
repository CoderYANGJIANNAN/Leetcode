public class Solution_796 {

    public static boolean rotateString(String s, String goal) {
        if(s == null || goal == null || s.length()==0 || goal.length()==0) return false;
        String newStr = s + s;
        return s.length() == goal.length() && (newStr).contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde",goal = "abced";
        System.out.println(rotateString(s,goal));
    }

}

//    public static boolean rotateString(String s, String goal) {
//        if(s == null || goal == null || s.length()==0 || goal.length()==0) return false;
//        String newStr = s + s;
//        int i=0,j=s.length();
//        while(j<2*s.length()){
//            String tmp = newStr.substring(i,j);
//            if(tmp.equals(goal)) return true;
//            i++;
//            j++;
//        }
//        return false;
//    }