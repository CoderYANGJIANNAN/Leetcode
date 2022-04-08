public class Solution38 {

    //快慢指针
    public static String countAndSay(int n) {
            String cur = "1";
            for(int i = 2;i<=n;i++){
                StringBuilder str = new StringBuilder();
                int start = 0;
                int pos = 0;
                    while(pos<cur.length()){
                        while(pos<cur.length() && cur.charAt(pos) == cur.charAt(start)){
                            pos++;
                        }
                        str.append(Integer.toString(pos-start)).append(cur.charAt(start));//两段append 不用+ 拼接
                        start = pos;
                    }
                cur = str.toString();
            }
            return cur;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}

//    FIRST ANWSER
//    String cur = "1";
//            for(int i = 2;i<=n;i++){
//                    StringBuilder str = new StringBuilder();
//                    for(int j = 0;j<cur.length();j++){
//        int count = 1;
//        while(j+1<cur.length()&&cur.charAt(j)==cur.charAt(j+1)){
//        count++;
//        j++;
//        }
//        str.append(String.valueOf(count)+cur.charAt(j));
//        }
//        cur = str.toString();
//        }
//        return cur;
