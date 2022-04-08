import javax.swing.*;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Solution146 {
    class DLinkedList{
        DLinkedList prev;
        DLinkedList next;
        int key;
        int value;
        public DLinkedList(){}
        public DLinkedList(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private Map<Integer,DLinkedList> lRUCache = new HashMap<>();
    private int capacity;
    private int size;
    private DLinkedList head,tail;

    public Solution146(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            head = new DLinkedList();
            tail = new DLinkedList();
            head.next = tail;
            tail.prev = head;
    }

    public int get(int key) {
        DLinkedList node = lRUCache.get(key);
        if(node == null) return -1;
        moveTohead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedList node = lRUCache.get(key);
        if(node == null){
            DLinkedList newNode = new DLinkedList(key,value);
            lRUCache.put(key,newNode);
            addTohead(newNode);
            size++;
            if(size>capacity) {
                DLinkedList tail = removeTail();
                lRUCache.remove(tail.key);
                size--;
            }
        }else {
            node.value = value;
            moveTohead(node);
        }
    }

    public void removeNode(DLinkedList node){
             node.prev.next = node.next;
             node.next.prev = node.prev;
    }

    public void moveTohead(DLinkedList node){
            removeNode(node);
            addTohead(node);
    }

    public void addTohead(DLinkedList node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
    }

    public DLinkedList removeTail(){
        DLinkedList res = tail.prev;
        removeNode(res);
        return res;
    }

}
