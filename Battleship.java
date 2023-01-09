import java.util.ArrayList;

public interface Battleship {
  public void setLocationCells(ArrayList<String> locationCells);

  public String checkYourself(String guess);

  public ArrayList<String> getLocationCells();

  public boolean isAlive();

}
