import java.util.LinkedList;
import java.util.List;

public class Solution412 {

            public static List<String> fizzBuzz(int n) {
                if(n<1) throw new IllegalArgumentException("Input error");
                List<String> list = new LinkedList<>();
                for(int i = 1;i<=n;i++){
                    if(i % 5 == 0 && i % 3==0){
                        list.add("FizzBuzz");
                    }
                    else if(i % 5 == 0){
                        list.add("Buzz");
                    }
                    else if(i % 3 == 0){
                        list.add("Fizz");
                    }
                    else list.add(String.valueOf(i));
                }
                return list;
            }

            public static void main(String[] args) {
                int n = 100;
                System.out.println(fizzBuzz(n));
            }

}
