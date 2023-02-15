import java.util.*;

public class JukeBoxUsingHashSet {
  public static void main(String[] args) {
    List<SongV3> songList = MockSongsV3.getSongs();
    songList.sort((first, second) -> first.getTitle().compareTo(second.getTitle()));
    HashSet<SongV3> songSet = new HashSet<>(songList);
    System.out.println(songSet);

  }
}
