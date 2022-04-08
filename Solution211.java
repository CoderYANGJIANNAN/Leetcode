import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution211 {

    private Node root;
    class Node{
        boolean isWord;
        Map<Character,Node> next;

        public Node(){
            isWord = false;
            next = new HashMap<>();
        }
    }
    public Solution211() {
        root = new Node();
    }

    public void addWord(String word) {
        Node cur = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.next.get(c)==null){
                cur.next.put(c,new Node());
            }
            cur = cur.next.get(c);
        }
            cur.isWord = true;
    }

    public boolean search(String word) {
        Node cur = root;
        return match(cur,word,0);
    }

    public boolean match(Node node,String word,int index){
            if(index == word.length()) return node.isWord;
            char c = word.charAt(index);
            if(c!='.'){
                if(node.next.get(c) == null) return false;
                return match(node.next.get(c),word,index+1);
            }else{
                for(char nextChar:node.next.keySet()){
                    if(match(node.next.get(nextChar),word,index+1)){
                        return true;
                    }
                }
                return false;
            }
    }
}

//    private Map<Integer,Set<String>> map;
//
//    public Solution211() {
//        map = new HashMap<>();
//    }
//
//    public void addWord(String word) {
//        if(!map.containsKey(word.length())){
//            map.put(word.length(),new HashSet<>());
//        }
//        map.get(word.length()).add(word);
//    }
//
//    public boolean search(String word) {
//        if(map.containsKey(word.length())&&map.get(word.length()).contains(word)){return true;}
//        if(map.containsKey(word.length())){
//            for (String s : map.get(word.length())) {
//                for (int i = 0;i<s.length();i++) {
//                    if(i<s.length()-1){
//                        if (word.charAt(i) == '.') continue;
//                        if (s.charAt(i) != word.charAt(i)) break;
//                    }
//                    else if(i == s.length()-1){
//                        if(s.charAt(i) == word.charAt(i) || word.charAt(i) == '.') return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }




//    public void addWord(String word) {
//        if(!map.containsKey(word.length())){
//            map.put(word.length(),new HashSet<>());
//        }
//        map.get(word.length()).add(word);
//    }
//
//    public boolean search(String word) {
//        if(map.containsKey(word.length())&&map.get(word.length()).contains(word)){return true;}
//        if(map.containsKey(word.length())){
//            for (String s : map.get(word.length())) {
//                for (int i = 0;i<s.length();i++) {
//                    if(i<s.length()-1){
//                        if (word.charAt(i) == '.') continue;
//                        if (s.charAt(i) != word.charAt(i)) break;
//                    }
//                    else if(i == s.length()-1){
//                        if(s.charAt(i) == word.charAt(i) || word.charAt(i) == '.') return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//    private Map<Integer,Set<String>> map;
//
//    public Solution211() {
//        map = new HashMap<>();
//    }
//
