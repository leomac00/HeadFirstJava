public class SongV2 extends Song {

  public SongV2(String title, String author, int bpm) {
    super();
    this.author = author;
    this.title = title;
    this.bpm = bpm;
  }

  public SongV2(String title) {
    super();
    this.author = "Unknown";
    this.title = title;
  }

}
