package main;

import java.util.LinkedHashMap;

public class LRUCache2 {

    private LinkedHashMap<Integer,Integer> map ;
    private int capacity;

    public LRUCache2(int capacity){
        this.capacity= capacity;
        map = new LinkedHashMap<>();
    }

    public void set(int key, int val){
        if(map.containsKey(key)){
            map.put(key,val);
            updateRecentyUsed(key);

        }
        if(map.size() == capacity){
            //remove last used -> entry at head
            int key2 = map.entrySet().iterator().next().getKey();
            map.remove(key2);

        }
        map.put(key,val);
    }

    public int get(int key){
        if(map.containsKey(key)){
            updateRecentyUsed(key);
            return map.get(key);
        }
        return  -1;
    }
    private void updateRecentyUsed(int key){
        int val = map.get(key);
        map.remove(key);
        map.put(key,val);
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2(2);
        cache.set(1,10);
        cache.set(5,12);
        System.out.println(cache.get(5));
        System.out.println(cache.get(1));
        System.out.println(cache.get(10));
        cache.set(6,14);
        System.out.println(cache.get(5));

    }
}
