import java.util.ArrayList;

public class StartupBust implements BattleshipGame {

  // Setup
  private ArrayList<Startup> startups = new ArrayList<Startup>();
  private GameHelper helper = new GameHelper();
  private int numOfGuesses = 0;

  public void setUpGame() {
    Startup s1Startup = new Startup("House");
    Startup s2Startup = new Startup("CSI'm hurt");
    Startup s3Startup = new Startup("Breaking Bald");
    startups.add(s1Startup);
    startups.add(s2Startup);
    startups.add(s3Startup);

    System.out.println("Your goal is to sink three Startups.");
    System.out.println(s1Startup.getName() + ", " + s2Startup.getName() + ", " + s3Startup.getName());
    System.out.println("Try to sink them all in the fewest number of guesses");

    for (Startup startup : startups) {
      ArrayList<String> newLocations = helper.placeStartup(3);
      startup.setLocationCells(newLocations);
    }

  }

  public void startPlaying() {
    while (!startups.isEmpty()) {
      String userGuess = helper.getUserInput("Take a guess: ");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  public void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = GuessResult.MISS.getText();
    for (Startup startupToTest : startups) {
      result = startupToTest.checkYourself(userGuess);
      if (result.equals(GuessResult.HIT.getText())) {
        break;
      }
      if (result.equals(GuessResult.KILL.getText())) {
        startups.remove(startupToTest);
        break;
      }
    }
    System.out.println(result);
  }

  public void finishGame() {
    System.out.println("All Startups are dead!");
    System.out.println("It only took you " + numOfGuesses + " guesses.");
  }

  public static void main(String[] args) {
    StartupBust game = new StartupBust();
    game.setUpGame();
    game.startPlaying();
  }
}
