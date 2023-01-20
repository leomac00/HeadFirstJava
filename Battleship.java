import java.util.ArrayList;

public interface Battleship {

  void setLocationCells(ArrayList<String> locationCells);

  String checkYourself(String guess);

  ArrayList<String> getLocationCells();

  boolean isAlive();

}
