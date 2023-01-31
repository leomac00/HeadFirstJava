import java.util.*;

public class Numbers {
  private int intNum;

  public int getIntNum() {
    return intNum;
  }

  public void setIntNum(int intNum) {
    this.intNum = intNum;
  }

  public Numbers() {
    this.intNum = 42;
  }

  public static void printInt(int number) {
    System.out.println(number);
  }

  public static int findMin(List<Integer> nums) {
    if (nums.size() == 1) {
      return nums.get(0);
    } else {
      int result = nums.get(0);
      for (int i : nums) {
        if (i < result) {
          result = i;
        }
      }
      return result;
    }
  }
}
