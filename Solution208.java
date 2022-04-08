import java.util.HashMap;
import java.util.Map;

public class Solution208 {

    class Nodee{
        public boolean isWord;
        public Map<Character,Nodee> next;
        public Nodee(){
            isWord=false;
            next = new HashMap<>();
        }
    }

    private Nodee root;

    public Solution208() {
        root=new Nodee();
    }

    public void insert(String word) {
        Nodee cur = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.next.get(c)==null){
                cur.next.put(c,new Nodee());
            }
            cur=cur.next.get(c);
        }
        cur.isWord=true;
    }

    public boolean search(String word) {
        Nodee cur = root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(cur.next.get(c)==null) return false;
            cur = cur.next.get(c);
        }
        return cur.isWord;
    }

    public boolean startsWith(String prefix) {
        Nodee cur = root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            if(cur.next.get(c)==null) return false;
            cur = cur.next.get(c);
        }
        return true;
    }

}
