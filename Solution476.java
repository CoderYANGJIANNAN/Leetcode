public class Solution476 {

            public static int findComplement(int num) {
                int highbit = 0;
                for(int i = 1;i<=30;i++){
                    if(num>=1<<i){
                        highbit = i;
                    }else {
                        break;
                    }
                }
                int mask = highbit == 30 ? 0x7fffffff : (1<<(highbit)+1)-1;//构造掩码
                return mask^num;
            }

            public static void main(String[] args) {
                System.out.println(findComplement(10));
            }

}

//