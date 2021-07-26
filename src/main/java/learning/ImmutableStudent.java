package learning;

import java.util.HashMap;
import java.util.Map;

/**
 * Custom Immutable class example.
 */
public final class ImmutableStudent {

  private final String name;

  private final int regNo;

  private final Map<String, String> metadata;

  /**
   * constructor
   *
   * @param name     String
   * @param regNo    int
   * @param metadata Map
   */
  public ImmutableStudent(String name, int regNo, Map<String, String> metadata) {
    this.name = name;
    this.regNo = regNo;

    Map<String, String> tempMap = new HashMap<>();

    for (Map.Entry<String, String> entry : metadata.entrySet()) {
      tempMap.put(entry.getKey(), entry.getValue());
    }
    this.metadata = tempMap;
  }

  /**
   * getName method
   *
   * @return String
   */
  public String getName() {
    return name;
  }

  /**
   * @return int
   */
  public int getRegNo() {
    return regNo;
  }

  /**
   * getMetadata
   *
   * @return Map
   */
  public Map<String, String> getMetadata() {
    Map<String, String> tempMap = new HashMap<>();

    for (Map.Entry<String, String> entry : metadata.entrySet()) {
      tempMap.put(entry.getKey(), entry.getValue());
    }
    return tempMap;
  }

  /**
   * main method
   *
   * @param args string array
   */
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    map.put("1", "first");
    map.put("2", "second");

    ImmutableStudent student = new ImmutableStudent("ABC", 101, map);

    System.out.println(student.getName());
    System.out.println(student.getRegNo());
    System.out.println(student.getMetadata());

    map.put("3", "Third");
    System.out.println(student.getMetadata());

  }
}
