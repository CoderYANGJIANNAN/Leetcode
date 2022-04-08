public class Solution1518 {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottle=numBottles,drink=numBottles;
        while(emptyBottle>=numExchange){
            int curAbleDrink = emptyBottle/numExchange;
            drink+=curAbleDrink;
            emptyBottle=curAbleDrink+emptyBottle%numExchange;
        }
        return drink;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15,4));
    }

}
