import java.util.HashMap;
import java.util.Map;

public class Solution677 {

    private Node root;
    class Node{
        boolean isWord;
        public Map<Character,Node> next;
        int val;

        public Node(){
            isWord = false;
            next = new HashMap<>();
            val = 0;
        }
    }
    public Solution677() {
        root = new Node();
    }

    public void insert(String key, int val) {
        Node cur = root;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(cur.next.get(c) == null){
                cur.next.put(c,new Node());
            }
            cur = cur.next.get(c);
        }
        cur.isWord = true;
        cur.val = val;
    }

    public int sum(String prefix) {
        Node cur = root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            if(cur.next.get(c) == null) return 0;
            cur = cur.next.get(c);
        }
        return sum(cur);
    }

    public int sum(Node node){
        if(node.next.size()==0) return node.val;
        int res = node.val;
        for(char c:node.next.keySet()){
           res+=sum(node.next.get(c));
        }
        return res;
    }

}

