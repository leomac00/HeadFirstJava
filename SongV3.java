public class SongV3 extends SongV2 {

  public SongV3(String title) {
    super(title);
    // TODO Auto-generated constructor stub
  }

  @Override
  public boolean equals(Object o) {
    SongV3 oSong = (SongV3) o;
    return this.title.equals(oSong.getTitle());
  }

  @Override
  public int hashCode() {
    return this.title.hashCode();
  }
}
