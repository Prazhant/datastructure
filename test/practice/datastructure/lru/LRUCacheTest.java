package practice.datastructure.lru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LRUCacheTest {


   @Test
   public  void lruCache_whenVlaidInput_replacesLeastUsedEntry(){
       LRUCache lruCache = new LRUCache(5);
       lruCache.put(1,10);
       lruCache.put(2,20);
       lruCache.put(3,30);
       lruCache.put(4,40);
       lruCache.put(5,50);


       assertTrue(lruCache.get(1)==10);
       assertTrue(lruCache.get(3)==30);
       assertTrue(lruCache.get(4)==40);
       assertTrue(lruCache.get(5)==50);


       lruCache.put(6,60);

       assertTrue(lruCache.get(2)==-1);
       assertTrue(lruCache.get(6)==60);
   }

    @Test
    public  void lruCacheWithoutLinkedHashMap_whenVlaidInput_replacesLeastUsedEntry(){
        LRUCacheWithoutHashMap lruCache = new LRUCacheWithoutHashMap(5);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        lruCache.put(4,40);
        lruCache.put(5,50);


        assertTrue(lruCache.get(1)==10);
        assertTrue(lruCache.get(3)==30);
        assertTrue(lruCache.get(4)==40);
        assertTrue(lruCache.get(5)==50);


        lruCache.put(6,60);

        assertEquals(-1, lruCache.get(2));
        assertTrue(lruCache.get(6)==60);
    }

}