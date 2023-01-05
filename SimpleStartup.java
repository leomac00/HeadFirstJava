public class SimpleStartup {
  private boolean isAlive = true;
  private int[] locationCells;
  private int numOfHits = 0;

  public boolean isAlive() {
    return isAlive;
  }

  public int getNumOfHits() {
    return numOfHits;
  }

  public void setLocationCells(int[] locationCells) {
    this.locationCells = locationCells;
  }

  public int[] getLocationCells() {
    return locationCells;
  }

  public String checkYourself(int guess) {
    String result = "miss";
    for (int cell : locationCells) {
      if (guess == cell) {
        result = "hit";
        this.numOfHits++;
        break;
      }
    }
    if (numOfHits == locationCells.length) {
      result = "kill";
      this.isAlive = false;
    }
    System.out.println(result);
    return result;
  }
}
