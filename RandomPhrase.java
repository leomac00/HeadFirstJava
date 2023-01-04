import java.util.Random;

public class RandomPhrase {
  public static void main(String[] args) {
    String[] color = { "blue ", "yellow ", "green " };
    String[] object = { "pen", "bottle", "mug" };
    String[] adjective = { "lazy ", " cool", "pretty " };

    Random randomGenerator = new Random();

    int[] rands = { randomGenerator.nextInt(color.length),
        randomGenerator.nextInt(object.length),
        randomGenerator.nextInt(adjective.length) };

    String phrase = "We need a " + color[rands[0]] + adjective[rands[2]] + object[rands[1]];
    System.out.println(phrase);
  }
}
