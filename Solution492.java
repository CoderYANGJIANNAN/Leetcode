import java.util.LinkedList;
import java.util.List;

public class Solution492 {

    public static int[] constructRectangle(int area) {
       int w = (int)Math.sqrt(area);
       while (area%w!=0){
           w--;
       }
       return new int[]{area/w,w};
    }

    public static void main(String[] args) {
        int[] a = constructRectangle(8);
        for(int b : a){
            System.out.println(b);
        }
    }
}

//        if(area == 0) return new int[]{};
//        List<Integer> list = new LinkedList<>();
//        int sqrtArea = (int)Math.sqrt(area);
//        int i = sqrtArea,j = sqrtArea;
//        while(i>=1 && j<=area){
//        int temp = i * j;
//        if(temp == area){
//        list.add(i);
//        list.add(j);
//        break;
//        }
//        else if (temp > area) i--;
//        else j++;
//        }
//        return new int[]{list.get(1),list.get(0)};
