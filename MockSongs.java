import java.util.*;

public class MockSongs {
  public static List<Song> getSongs() {
    List<Song> songsStrings = new ArrayList<>();
    Collections.addAll(songsStrings,
        new SongV2("Something in the way"),
        new SongV2("Ana julia"),
        new SongV2("$10"),
        new SongV2("$10"),
        new SongV2("50 ways"));
    return songsStrings;
  }
}
