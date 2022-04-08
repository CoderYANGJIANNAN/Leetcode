public class Solution917 {

    public static String reverseOnlyLetters(String s) {
            if(s.length()<=0) return s;
            char[] arr = s.toCharArray();
            int i=0,j=s.length()-1;
            while(i<j){
                while(i<s.length()&&i<j&&!Character.isLetter(s.charAt(i))){
                    i++;
                }
                while(j>=0&&i<j&&!Character.isLetter(s.charAt(j))){
                    j--;
                }
                swap(arr,i,j);
                i++;
                j--;
            }
            return new String(arr);
    }

    public static void swap(char[] arr,int left,int right){
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghlj"));
    }

}




//    public static String reverseOnlyLetters(String s) {
//        if(s.length()<=0) return s;
//        StringBuilder str = new StringBuilder();
//        int i=0,j=s.length()-1;
//        for(;i<s.length();i++){
//            char Left = s.charAt(i);
//            if(!Character.isLetter(Left)){
//                str.append(Left);
//            }else {
//                while(j>=0){
//                    char Right = s.charAt(j);
//                    if(Character.isLetter(Right)){
//                        str.append(Right);
//                        j--;
//                        break;
//                    }else {
//                        j--;
//                    }
//                }
//            }
//        }
//        return str.toString();
//    }