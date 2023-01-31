import java.util.ArrayList;

public class LanchoneteTest {

  private static boolean TestMenu01() {
    ArrayList<Comestivel> comidas = new ArrayList<Comestivel>();
    ArrayList<Acompanhamentos> acompanhamentosLanche = new ArrayList<Acompanhamentos>();
    acompanhamentosLanche.add(Acompanhamentos.SALADA);
    comidas.add(new Lanche(Proteina.CARNE, acompanhamentosLanche));
    comidas.add(new Refrigerante());
    comidas.add(new Refrigerante());
    return Lanchonete.calcularTotal(comidas) == 30;
  }

  private static boolean TestMenu02() {
    ArrayList<Comestivel> comidas = new ArrayList<Comestivel>();
    ArrayList<Acompanhamentos> acompanhamentosLanche = new ArrayList<Acompanhamentos>();
    ArrayList<Acompanhamentos> acompanhamentosBatata = new ArrayList<Acompanhamentos>();
    comidas.add(new Lanche(Proteina.CARNE, acompanhamentosLanche));
    comidas.add(new Lanche(Proteina.CARNE, acompanhamentosLanche));
    acompanhamentosBatata.add(Acompanhamentos.MAIONESE);
    comidas.add(new Batata(acompanhamentosBatata));
    comidas.add(new Batata(acompanhamentosBatata));
    comidas.add(new Refrigerante());
    return Lanchonete.calcularTotal(comidas) == 58;
  }

  private static String formatTestResult(boolean result) {
    if (result)
      return "Passou com sucesso!";
    return "Falhou.";
  }

  public static void main(String[] args) {

    System.out
        .println("Test Menu 01: Entrada: 1 hamburguer de carne com salada e 2 refrigerantes; Saída: 30 -> Result: "
            + formatTestResult(TestMenu01()));
    System.out.println(
        "Test Menu 02: Entrada: 2 hamburguer de carne sem salada, 2 batatas fritas com maionese e 1; Saida: 58 -> Result: "
            + formatTestResult(TestMenu02()));

  }
}
