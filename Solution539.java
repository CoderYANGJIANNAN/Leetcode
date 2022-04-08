import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution539 {

    public static int findMinDifference(List<String> timePoints) {
            if(timePoints.size()<=0) return 0;
            int[] arrs = new int[timePoints.size()];
            for(int i=0;i<timePoints.size();i++){
                arrs[i]=Integer.parseInt(timePoints.get(i).substring(0,2))*60+Integer.parseInt(timePoints.get(i).substring(3));
            }
            Arrays.sort(arrs);
            int min = Integer.MAX_VALUE;
            for(int i=1;i<arrs.length;i++){
                min = Math.min(min,arrs[i]-arrs[i-1]);
            }
            return Math.min(arrs[0]+1440-arrs[arrs.length-1],min);
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("14:22");
        list.add("00:00");
        list.add("21:23");
        list.add("23:59");
        System.out.println(findMinDifference(list));
    }
}



//
//    public static int findMinDifference(List<String> timePoints) {
//        if (timePoints.size() < 1) return 0;
//        String[] str = timePoints.toArray(new String[timePoints.size()]);
//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String str1 = o1.substring(0, 2), str2 = o2.substring(0, 2);
//                String str3 = o1.substring(3, 5), str4 = o2.substring(3, 5);
//                if (str1.equals(str2)) {
//                    return Integer.parseInt(str4) - Integer.parseInt(str3);
//                } else {
//                    return Integer.parseInt(str2) - Integer.parseInt(str1);
//                }
//            }
//        });
//        int res = Integer.MAX_VALUE;
//        for (int i = 0, j = 1; i < str.length; j=(j+1)%str.length, i++) {
//            int a1 = Integer.parseInt(str[i].substring(0, 2)),a2 = Integer.parseInt(str[i].substring(3, 5));
//            int b1 = Integer.parseInt(str[j].substring(0, 2)),b2 = Integer.parseInt(str[j].substring(3, 5));
//            int oriDif = Math.abs(a1*60+a2 - b1*60-b2);
//            if(a1>b1){
//                b1=b1+24;
//            }
//            else {
//                a1=a1+24;
//            }
//            int newDif =  Math.abs(a1*60+a2 - b1*60-b2);
//            res = Math.min(res,Math.min(newDif,oriDif));
//        }
//        return res;
//    }

