import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Song> songList = MockSongs.getSongs();
    Collections.sort(songList);
    System.out.println(songList);
  }
}
