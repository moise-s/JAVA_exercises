// Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
// Calcular e imprimir o seguinte:
// Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
// Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
// Se o número de lados for igual a 5 escrever PENTÁGONO.
// Obs: O foco aqui é a lógica com o comando de controle IF, demais conhecimentos envolvidos pesquise mais. 

import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int nLados;
    double valLado;
    double area = 0;

    System.out.print("Digite o número de lados: ");
    nLados = input.nextInt();

    while (nLados < 3 || nLados > 5) {
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
