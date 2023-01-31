public class Refrigerante implements Comestivel {

  private float valorFinal;

  public float getValorFinal() {
    return valorFinal;
  }

  public void setValorFinal(float valorFinal) {
    this.valorFinal = valorFinal;
  }

  public Refrigerante() {
    float total = 4;
    setValorFinal(total);
  }

  public static Refrigerante getPedido() {
    return new Refrigerante();
  }
}
