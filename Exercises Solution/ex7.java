// Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.

import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double entry, quad, cubo, raizQ;
    entry = 1;

    System.out.print("Por favor digite um número positivo: ");
    entry = input.nextDouble();

    while (entry > 0) {

      // calculations
      quad = entry * entry;
      cubo = entry * entry * entry;
      raizQ = Math.sqrt(entry);

      // Showing values
      System.out.println("Número digitado: " + entry);
      System.out.println("seu quadrado: " + quad);
      System.out.println("seu cubo: " + cubo);
      System.out.println("raiz quadrada: " + raizQ);

      // run again
      System.out.print("Por favor digite mais um número: ");
      entry = input.nextDouble();

    }

    // FINISH
    System.out.println("Você saiu do programa!");
    input.close();
  }
}