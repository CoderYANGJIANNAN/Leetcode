import java.util.*;

public class Solution1436 {

    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for(List<String> p : paths){
            map.put(p.get(0),p.get(1));
        }
        String ans = paths.get(0).get(0);
        while(map.containsKey(ans)) ans =  map.get(ans);
        return ans;
    }
}

//         Set<String> set = new HashSet<>();
//            for(int i = 0;i<paths.size();i++){
//        set.add(paths.get(i).get(0));
//        }
//        for(List<String> path : paths){
//        if(!set.contains(path.get(1))){
//        return path.get(1);
//        }
//        }
//        return "";


//        Set<String> set = new TreeSet<>();
//        String res = new String();
//            for(int i = 0;i<paths.size();i++){
//        List<String> list = paths.get(i);
//        set.add(list.get(0));
//        set.add(list.get(1));
//        }
//        for(int i = 0;i<paths.size();i++){
//        List<String> list1 = paths.get(i);
//        if(set.contains(list1.get(0))){
//        set.remove(list1.get(0));
//        }
//        }
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()){
//        res = iterator.next();
//        }
//        return res;