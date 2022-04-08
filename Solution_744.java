public class Solution_744 {

    /**
     *方法注释
     * @param letters
     * @param target
     * @return
     */
    /**
     *
     *
     *     类注释
     *
     *
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        int lo = 0,hi = letters.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(letters[mid]>target){
                if(mid == 0 || letters[mid-1]<=target){
                    return letters[mid];
                }
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char[] letters = {'a','b'};
        char t = 'z';
        System.out.println(nextGreatestLetter(letters, t));
    }

}
