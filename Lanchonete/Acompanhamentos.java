public enum Acompanhamentos {
  SALADA(2),
  MAIONESE(1);

  private final float value;

  private Acompanhamentos(float value) {
    this.value = value;
  }

  public float getValue() {
    return this.value;
  }
}
