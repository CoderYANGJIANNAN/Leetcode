import java.util.*;

public class Solution496 {


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map = new HashMap<>();
            Stack<Integer> stack = new Stack<>();
            int[] res = new int[nums1.length];
            for(int j = 0;j<nums1.length;j++){
                map.put(nums1[j],j);
            }
            for(int i = nums2.length-1;i>=0;i--){
                while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                    stack.pop();
                }
                if(map.containsKey(nums2[i])) {
                    res[map.get(nums2[i])] = stack.isEmpty() ? -1 : stack.peek();
                }
                stack.push(nums2[i]);
            }
            return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {3,2,1};
        int[] a = nextGreaterElement(nums1, nums2);
        for(int b : a){
            System.out.println(b);
        }
    }

}

//    List<Integer> list = new LinkedList<>();
//    Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0;i<nums2.length;i++){
//        map.put(nums2[i],i);
//        }
//        for(int j : nums1){
//        int index = map.get(j);
//
//        for(int m = index;m<nums2.length;m++){
//        if(j<nums2[m]){
//        list.add(nums2[m]);
//        break;
//        }
//        if(m == nums2.length-1) list.add(-1);
//        }
//
//        }
//        int[] res = new int[list.size()];
//        for(int n = 0;n<res.length;n++){
//        res[n] = list.get(n);
//        }
//        return res;