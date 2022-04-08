import java.util.HashSet;
import java.util.Set;

public class Solution_762 {

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(17);
        set.add(19);
        set.add(23);
        for(int i=left;i<=right;i++){
            int c = Integer.bitCount(i);
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }

}
