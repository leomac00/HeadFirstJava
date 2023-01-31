import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {

  public static float calcularTotal(ArrayList<Comestivel> comidas) {
    float total = 0;
    for (Comestivel comida : comidas) {
      total += comida.getValorFinal();
    }
    return total;
  }

  private static void atender() {
    float total = 0;
    boolean pedirDeNovo = true;
    ArrayList<Comestivel> comidas = new ArrayList<Comestivel>();
    Scanner scanner = new Scanner(System.in);
    while (pedirDeNovo) {
      // Perguntar se quer lanche
      System.out.println("Deseja hamburguer? (true/false)");
      boolean lanche = scanner.nextBoolean();
      if (lanche) {
        Lanche l = Lanche.getPedido();
        comidas.add(l);
      }
      System.out.println();

      // Perguntar se quer batata
      System.out.println("Deseja batata? (true/false)");
      boolean batata = scanner.nextBoolean();
      if (batata) {
        Batata b = Batata.getPedido();
        comidas.add(b);
      }
      System.out.println();

      // Perguntar se quer refrigerante
      System.out.println("Deseja refrigerante? (true/false)");
      boolean refrigerante = scanner.nextBoolean();
      if (refrigerante) {
        Refrigerante r = Refrigerante.getPedido();
        comidas.add(r);
      }
      System.out.println();

      System.out.println("Deseja pedir mais? (true/false)");
      pedirDeNovo = scanner.nextBoolean();
    }
    // Somar todos os itens dentro das listas
    total += Lanchonete.calcularTotal(comidas);
    // exibir resultado
    System.out.println();
    System.out.printf("Total: %.2f", total);
    scanner.close();
  }

  public static void main(String[] args) {
    atender();
  }
}
