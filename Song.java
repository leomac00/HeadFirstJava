public abstract class Song implements Comparable<Song> {
  protected String title;
  protected String author;
  protected int bpm;

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getBpm() {
    return bpm;
  }

  public String toString() {
    return this.title + " by " + this.author;
  }

  @Override
  public int compareTo(Song o) {
    return this.getTitle().compareTo(o.getTitle());
  }
}
