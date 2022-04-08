public class Solution400 {

    public static int findNthDigit(int n) {
        int i=0,j=1;
        for(;i<=11;i++,j++){
            long cur=9*(long)Math.pow(10,i)*j;//防止溢出设long
            if(n<=cur) break;
            else n-=cur;
        }
        int nums=(n/(i+1))-1; //该区域的第几个数 比如n=11 在第一轮用掉9位数消耗掉1-9这个区域后，n=2,nums=0,因此是这个区域(10-99)第0个数,是10（我们从0开始算）
        int remainder=n%(i+1); // 该数的第几个数字（索引）
        int location=(int)Math.pow(10,i)+nums;//具体的数是多少 n=2时 10+0=10，说明具体的数是0
        String tmp=String.valueOf(location);
        if(remainder==0) return (int)tmp.charAt(tmp.length()-1)-'0';//如果余数为0,当前指针正好指向数的最后一个数字
        else tmp = String.valueOf(++location);//如果余数不为0,指针应指向得到的数的下个数
        return (int)tmp.charAt(remainder-1)-'0';
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(281));
    }

}
