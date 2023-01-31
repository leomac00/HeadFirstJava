import java.util.ArrayList;
import java.util.Scanner;

public class Batata implements Comestivel {

  private float valorFinal;

  public float getValorFinal() {
    return valorFinal;
  }

  public void setValorFinal(float valorFinal) {
    this.valorFinal = valorFinal;
  }

  public Batata(ArrayList<Acompanhamentos> acompanhamentos) {
    float total = 6;
    for (Acompanhamentos acompanhamento : acompanhamentos) {
      total += acompanhamento.getValue();
    }
    setValorFinal(total);
  }

  public static Batata getPedido() {
    ArrayList<Acompanhamentos> acompanhamentos;
    Scanner scanner = new Scanner(System.in);
    Boolean maionese = false;
    acompanhamentos = new ArrayList<Acompanhamentos>();
    System.out.println("Deseja maionese? (true/false)");
    maionese = scanner.nextBoolean();
    if (maionese)
      acompanhamentos.add(Acompanhamentos.MAIONESE);
    return new Batata(acompanhamentos);
  }
}
