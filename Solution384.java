public class Solution384 {

    private int[] origin;
    private int[] array;
    public Solution384(int[] nums) {
        origin = nums;
        array  = new int[nums.length];
        System.arraycopy(nums,0,array,0,nums.length);
    }

    public int[] reset() {
        System.arraycopy(origin,0,array,0,array.length);
        return origin;
    }

    public int[] shuffle() {
        int m = array.length,t=0,index=0;
        while(m>0){
            index = (int)Math.floor(Math.random()*m--);
            t = array[m];
            array[m] = array[index];
            array[index] = t;
        }
        return array;
    }

}
