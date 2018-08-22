package practice.datastructure.lru;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithoutHashMap {

    private Map<Integer,Node> map = Collections.synchronizedMap(new HashMap<Integer,Node>());
    private Node head;
    private Node tail;
    private int capacity;

    public LRUCacheWithoutHashMap(int capacity) {
        this.capacity = capacity;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node oldNode=map.get(key);
            oldNode.setValue(value);
            remove(oldNode);
            setHead(oldNode);
        }else{
            Node node = new Node(key,value);
            if(map.size()<capacity){
                setHead(node);
            }else{
                map.remove(tail.getKey());
                remove(tail);
                setHead(node);
            }
            map.put(key,node);
        }


    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node valueNode = map.get(key);
            remove(valueNode);
            setHead(valueNode);
            return valueNode.getValue();
        }
            return -1;
    }

    private void setHead(Node valueNode) {
            valueNode.setAfter(head);
            valueNode.setPrev(null);

            if(head!=null){
                head.setPrev(valueNode);
            }
            head=valueNode;

            if(tail==null){
                tail=valueNode;
            }
    }

    private void remove(Node valueNode) {
        if(valueNode.getPrev()!=null){
            valueNode.getPrev().setAfter(valueNode.getAfter());
        }else{
            head=valueNode.getAfter();
        }

        if(valueNode.getAfter()!=null){
            valueNode.getAfter().setPrev(valueNode.getPrev());
        }else{
            tail=valueNode.getPrev();
        }

    }
}
