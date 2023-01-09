import java.util.ArrayList;

public class Startup implements Battleship {
  private boolean isAlive = true;
  private ArrayList<String> locationCells;
  private int numOfHits = 0;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Startup(String name) {
    this.name = name;
  }

  public boolean isAlive() {
    return isAlive;
  }

  public int getNumOfHits() {
    return numOfHits;
  }

  public void setLocationCells(ArrayList<String> locationCells) {
    this.locationCells = locationCells;
  }

  public ArrayList<String> getLocationCells() {
    return locationCells;
  }

  public String checkYourself(String guess) {
    String result = GuessResult.MISS.getText();
    int guessIndex = locationCells.indexOf(guess);
    if (guessIndex >= 0) {
      locationCells.remove(guessIndex);
      if (locationCells.isEmpty()) {
        result = GuessResult.KILL.getText();
      } else {
        result = GuessResult.HIT.getText();
      }
    }
    return result;
  }
}
