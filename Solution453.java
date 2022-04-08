import java.util.Arrays;

public class Solution453 {

            public static int minMoves(int[] nums) {
               int min =  Arrays.stream(nums).min().getAsInt();
               int count = 0;
               for(int num : nums){
                   count += num - min;
               }
               return count;
            }

            public static void main(String[] args) {
                int[] a = {1,1,1};
                System.out.println(minMoves(a));
            }
}
