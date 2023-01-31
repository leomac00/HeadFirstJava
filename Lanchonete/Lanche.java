import java.util.ArrayList;
import java.util.Scanner;

public class Lanche implements Comestivel {
  private float valorFinal;

  public float getValorFinal() {
    return valorFinal;
  }

  public void setValorFinal(float valorFinal) {
    this.valorFinal = valorFinal;
  }

  public Lanche(Proteina proteina, ArrayList<Acompanhamentos> acompanhamentos) {
    float total = 0;
    total += proteina.getValue();
    for (Acompanhamentos acompanhamento : acompanhamentos) {
      total += acompanhamento.getValue();
    }
    setValorFinal(total);
  }

  public static Lanche getPedido() {
    ArrayList<Acompanhamentos> acompanhamentos;
    Scanner scanner = new Scanner(System.in);
    Boolean maionese = false;
    Boolean salada = false;
    String proteinaString;

    acompanhamentos = new ArrayList<Acompanhamentos>();
    System.out.println("Qual proteina? (carne/frango)");
    proteinaString = scanner.next().toUpperCase();
    System.out.println("Deseja maionese? (true/false)");
    maionese = scanner.nextBoolean();
    if (maionese)
      acompanhamentos.add(Acompanhamentos.MAIONESE);
    System.out.println("Deseja salada? (true/false)");
    salada = scanner.nextBoolean();
    if (salada)
      acompanhamentos.add(Acompanhamentos.SALADA);
    System.out.println();
    return new Lanche(Proteina.valueOf(proteinaString), acompanhamentos);
  }
}
