package practice.datastructure.lru;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache extends LinkedHashMap{

    private int capacity;


    public LRUCache(int capacity) {
        super(capacity,0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer i = (Integer) super.get(key);
        Integer integer = Optional.ofNullable(i).orElse(-1);
        return integer.intValue();
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return super.size()>capacity;
    }
}