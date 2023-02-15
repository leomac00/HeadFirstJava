import java.util.*;

public class MockSongsV3 {
  public static List<SongV3> getSongs() {
    List<SongV3> songsStrings = new ArrayList<>();
    Collections.addAll(songsStrings,
        new SongV3("Something in the way"),
        new SongV3("Ana julia"),
        new SongV3("$10"),
        new SongV3("$10"),
        new SongV3("50 ways"));
    return songsStrings;
  }
}
