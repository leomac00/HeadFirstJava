import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Numbers myNumbers = new Numbers();
    Numbers.printInt(myNumbers.getIntNum());
    System.out.println(ConstantInit1.X_VALUE);
    for (int num : ConstantInit1.NUM_LIST) {
      System.out.print(num + " ");
    }
    System.out.println();
    List<Integer> list = Arrays.stream(ConstantInit1.NUM_LIST)
        .boxed()
        .collect(Collectors.toList());
    System.out.println(Numbers.findMin(list));

    String s = String.format("%d, %d", 1, 2);
    System.out.println(s);
  }
}
