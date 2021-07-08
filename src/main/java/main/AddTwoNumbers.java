package main;

import com.google.common.annotations.VisibleForTesting;

/**
 * Class for adding two numbers.
 * 
 * @author somesh
 *
 */
@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class AddTwoNumbers {
  /**
   * Static Method to add two numbers.
   * 
   * @param a int
   * @param b int
   * @return int
   */
  public static int add(int a, int b) {
    return a + b;
  }

  /**
   * private method
   *
   * @param a int
   * @param b int
   * @return int
   */
  public int sum(int a, int b){
    return call(a,b);
  }

  public int call(int a, int b){
    return a + b;
  }
}
