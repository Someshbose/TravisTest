package main;

import java.util.LinkedHashMap;

public class LRUCache2 {

  private final LinkedHashMap<Integer, Integer> map;
  private final int capacity;

  /**
   * Constructor for LRU Cache
   *
   * @param capacity int
   */
  public LRUCache2(int capacity) {
    this.capacity = capacity;
    map = new LinkedHashMap<>();
  }

  /**
   * setter
   *
   * @param key int
   * @param val int
   */
  public void set(int key, int val) {
    if (map.containsKey(key)) {
      map.put(key, val);
      updateRecentlyUsed(key);

    }
    if (map.size() == capacity) {
      //remove last used -> entry at head
      int key2 = map.entrySet().iterator().next().getKey();
      map.remove(key2);

    }
    map.put(key, val);
  }

  /**
   * getter
   *
   * @param key int
   * @return int
   */
  public int get(int key) {
    if (map.containsKey(key)) {
      updateRecentlyUsed(key);
      return map.get(key);
    }
    return -1;
  }

  /**
   * update menthod
   *
   * @param key int
   */
  private void updateRecentlyUsed(int key) {
    int val = map.get(key);
    map.remove(key);
    map.put(key, val);
  }

  /**
   * main method
   *
   * @param args string array
   */
  public static void main(String[] args) {
    LRUCache2 cache = new LRUCache2(2);
    cache.set(1, 10);
    cache.set(5, 12);
    System.out.println(cache.get(5));
    System.out.println(cache.get(1));
    System.out.println(cache.get(10));
    cache.set(6, 14);
    System.out.println(cache.get(5));

  }
}
