// Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
// Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
// Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

import java.util.Scanner;

public class ex15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int nLados;
    double valLado;
    double area = 0;

    System.out.print("Digite o número de lados: ");
    nLados = input.nextInt();

    while (nLados < 3) {
      System.out.println("NÃO É UM POLÍGONO");
      System.out.print("Digite o número de lados (min 3 e máx 5): ");
      nLados = input.nextInt();
    }

    while (nLados > 5) {
      System.out.println("POLÍGONO NÃO IDENTIFICADO");
      System.out.print("Digite o número de lados (min 3 e máx 5): ");
      nLados = input.nextInt();
    }

    System.out.print("Digite o valor do lado (em cm): ");
    valLado = input.nextDouble();

    while (valLado <= 0) {
      System.out.print("Digite o valor do lado (VALOR POSITIVO): ");
      valLado = input.nextDouble();
    }
    if (nLados == 3) {
      area = valLado * (valLado * Math.sqrt(3) / 2) / 2;
      System.out.println("TRIANGULO de área: " + area);
    } else if (nLados == 4) {
      area = valLado * valLado;
      System.out.println("QUADRADO de área: " + area);
    } else if (nLados == 5) {
      System.out.println("PENTAGONO");
    }
    input.close();
  }
}