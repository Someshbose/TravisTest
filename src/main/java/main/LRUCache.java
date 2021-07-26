package main;
//
//import java.util.HashMap;
//
//class Node {
//  private final int key;
//  private final int value;
//  private Node preNode, postNode;
//
//  public Node(int key, int value) {
//    this.key = key;
//    this.value = value;
//  }
//
//  public int getKey() {
//    return key;
//  }
//
//  public int getValue() {
//    return value;
//  }
//
//  public void setPostNode(Node postNode) {
//    this.postNode = postNode;
//  }
//
//  public void setPreNode(Node preNode) {
//    this.preNode = preNode;
//  }
//
//  public Node getPostNode() {
//    return postNode;
//  }
//
//  public Node getPreNode() {
//    return preNode;
//  }
//}


public class LRUCache {
//  private final HashMap<Integer, Node> hashMap;
//  private final int capacity;
//
//  private Node head = null;
//  private Node end = null;
//
//  public LRUCache(int capacity) {
//    this.capacity = capacity;
//    hashMap = new HashMap<>();
//  }
//
//  public void add(int key, int value) {
//    if (hashMap.size() == capacity) {
//      Node node = removeFromHead();
//      hashMap.remove(node.getKey());
//    }
//
//    Node node = new Node(key, value);
//    hashMap.put(key, node);
//    set(node);
//  }
//
////  public void delete(int key) {
////    if (hashMap.containsKey(key)) {
////      Node node = hashMap.get(key);
////      remove(node);
////    }
////  }
//
//  private Node removeFromHead() {
//    Node r = head;
//    head = head.getPostNode();
//    head.setPreNode(null);
//    return r;
//  }
//
//  public int get(int key) {
//    if (hashMap.containsKey(key)) {
//      Node node = hashMap.get(key);
//      remove(node);
//      set(node);
//      return node.getValue();
//    }
//    return -1;
//  }
//
//  private void remove(Node node) {
//    Node temp = head;
//
//    if (head.getKey() == node.getKey()) {
//      head = head.getPostNode();
//      head.setPreNode(null);
//    } else {
//      while (temp != null) {
//        if (node.getKey() == temp.getKey()) {
//          Node pre = temp.getPreNode();
//          Node post = temp.getPostNode();
//          pre.setPostNode(post);
//          break;
//        }
//      }
//    }
//  }
//
//  private void set(Node node) {
//    if (head == null) {
//      head = node;
//      end = node;
//    } else {
//      end.setPostNode(node);
//      node.setPreNode(end);
//      end = end.getPostNode();
//    }
//
//  }
//
//  public static void main(String[] args) {
//    LRUCache cache = new LRUCache(2);
//    cache.add(1, 10);
//    System.out.println("Add successful");
//    cache.add(5, 12);
//    System.out.println(cache.get(5));
//    System.out.println("fetch successful");
//    System.out.println(cache.get(1));
//    System.out.println(cache.get(10));
//    cache.add(6, 14);
//    System.out.println(cache.get(5));
//
//  }
}
