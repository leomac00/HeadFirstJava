public interface BattleshipGame {
  public void setLocationCells(int[] locationCells);

  public String checkYourself(int guess);

  public int[] getLocationCells();

  public boolean isAlive();

}
