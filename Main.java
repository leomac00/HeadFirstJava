import java.io.Console;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // Setup
    SimpleStartup startup = new SimpleStartup();
    Random rg = new Random();
    int numOfGuesses = 0;
    int position = rg.nextInt(4);
    int[] locationCells = { position, position + 1, position + 2 };
    // game Start
    startup.setLocationCells(locationCells);
    Console csl = System.console();
    while (startup.isAlive()) {
      System.out.println("Take a guess:");
      int guess = Integer.parseInt(csl.readLine());
      String guessResult = startup.checkYourself(guess);
      if (guessResult.equals("miss")) {
        numOfGuesses++;
      }
    }
    System.out.println("You missed -" + numOfGuesses + "- guesses.");
  }
}
