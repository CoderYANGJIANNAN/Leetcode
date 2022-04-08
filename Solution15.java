import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution15 {

    public static List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for(int first=0;first<n;first++){
                if(first>0&&nums[first] == nums[first-1]){
                    continue;
                }
                int target = -nums[first];
                int third = n-1;
                for(int second=first+1;second<n;second++){
                    if(second>first+1&&nums[second] == nums[second-1]){
                        continue;
                    }
                    while(second<third&&nums[second]+nums[third]>target){
                        --third;
                    }
                    if(third==second) break;
                    if(nums[second]+nums[third]==target){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[first]);
                        l.add(nums[second]);
                        l.add(nums[third]);
                        list.add(l);
                    }
                }
            }
            return list;
    }

    public static void main(String[] args) {
        int[] num = {-1,-3,4,4,4,4};
        System.out.println(threeSum(num));
    }


}


//  暴力 哈哈哈
//  if(nums==null||nums.length<=0) return new ArrayList<>();
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//        for(int j=i+1;j<nums.length;j++){
//        for(int k=0;k!=i&&k!=j&&k< nums.length;k++){
//        List<Integer> l = new ArrayList<>();
//        if(nums[i]+nums[j]==-nums[k]){
//        int[] temp = new int[]{nums[i],nums[j],nums[k]};
//        Arrays.sort(temp);
//        l.add(temp[0]);
//        l.add(temp[1]);
//        l.add(temp[2]);
//        list.add(new ArrayList<>(l));
//        }
//        }
//        }
//        }
//        List<List<Integer>> res = new ArrayList<>(new HashSet<>(list));
//
//        return res;
