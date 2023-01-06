public enum GuessResult {
  HIT("hit"),
  MISS("miss"),
  KILL("kill");

  private final String text;

  GuessResult(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }
}
