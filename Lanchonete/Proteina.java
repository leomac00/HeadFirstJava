public enum Proteina {
  CARNE(20, "CARNE"),
  FRANGO(16, "FRANGO");

  private final float value;
  private final String text;

  private Proteina(float value, String text) {
    this.value = value;
    this.text = text;
  }

  public float getValue() {
    return this.value;
  }

  public String getText() {
    return this.text;
  }
}
