import java.util.HashMap;

public class Solution447 {

            public static int numberOfBoomerangs(int[][] points) {
                if(points == null) return 0;
                if(points.length<3) return 0;

                HashMap<Double,Integer> hashMap = new HashMap<>();
                int res = 0;
                for(int i = 0;i< points.length;i++){
                    for(int j = 0;j< points.length;j++){  //注意这里是有方向的 所以 0，1不等于1，0 两个点的距离要求两次
                        if(i!=j){
                            double dis = Math.pow(points[i][0] - points[j][0],2) + Math.pow(points[i][1] - points[j][1],2);
                            if(!hashMap.containsKey(dis)){
                                hashMap.put(dis,1);
                            }
                            else {
                                hashMap.put(dis, hashMap.get(dis)+1);
                            }
                        }
                    }

                    for(double key: hashMap.keySet()){
                        if(hashMap.get(key)>1) res = res + hashMap.get(key)*(hashMap.get(key)-1);
                    }
                    hashMap.clear();
                }
                return res;
            }


            public static void main(String[] args) {
                int[][] points = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
                System.out.println(numberOfBoomerangs(points));
            }
}

/*

    others anwser

    class Solution {
    public int numberOfBoomerangs(int[][] points) {
    int len = points.length;
	int ans = 0;
	HashMap<Double, Integer> map = new HashMap<Double, Integer>();
	for(int i = 0; i < len; i++){
	     for(int j = 0; j < len; j++){
		if(i != j){
		    double dis = Math.pow(points[i][0] - points[j][0], 2)
				+ Math.pow(points[i][1] - points[j][1], 2);
		    if(!map.containsKey(dis)){
			map.put(dis, 1);
		    }else{
			int n = map.get(dis);
			ans += 2 * n;
			map.put(dis, 1+n);
		    }
		}
	    }
	    map.clear();
	}
	return ans;
    }
}
 */