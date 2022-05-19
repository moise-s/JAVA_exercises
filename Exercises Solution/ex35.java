import java.util.Scanner;

public class ex35 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    double custoFab, custoCons, distribuicao, imposto;
    custoCons = 0;
    distribuicao = 0;
    imposto = 1;

    System.out.print("Por favor, digite o custo de fábrica: ");
    custoFab = input.nextDouble();

    if (custoFab < 12000) {
      distribuicao = 1.05;
    } else if (custoFab < 25000) {
      distribuicao = 1.1;
      imposto = 1.15;
    } else {
      distribuicao = 1.15;
      imposto = 1.2;
    }

    custoCons = custoFab * distribuicao * imposto;

    System.out.println("O custo ao consumidor será de R$  " + custoCons);

  }
}