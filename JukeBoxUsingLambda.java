import java.util.*;

public class JukeBoxUsingLambda {
  public static void main(String[] args) {
    List<Song> songList = MockSongs.getSongs();
    songList.sort((first, second) -> first.getTitle().compareTo(second.getTitle()));
    System.out.println(songList);
  }
}
