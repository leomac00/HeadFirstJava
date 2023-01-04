public class BottleSong {
  public static void main(String[] args) {
    int amount = 10;
    String word = "bottles";

    while (amount > 0) {
      if (amount == 1) {
        word = "bottle";
      }
      System.out.println(amount + " green " + word + ", hanging on the wall");
      System.out.println(amount + " green " + word + ", hanging on the wall");
      System.out.println("And if one bottle should accidentally fall, ");
      amount--;
      if (amount > 0) {
        System.out.println("There'll be " + amount + " green " + word + ", hanging on the wall");
      } else {
        System.out.println("there'll be no green bottles hanging on the wall.");
      }
    }
  }
}