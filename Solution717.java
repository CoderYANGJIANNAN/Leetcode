public class Solution717 {

    public static boolean isOneBitCharacter(int[] bits) {
        if(bits.length<=0) return false;
        if(bits.length == 1) return true;
        int count = 0;
        for(int i = bits.length-2;i>=0;i--){
                while(i>=0&&bits[i] == 1){
                    count++;
                    i--;
                }
                break;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        int[] bits = {0,0};
        System.out.println(isOneBitCharacter(bits));
    }

}
