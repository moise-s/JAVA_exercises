// Desenvolva um programa que dado um número, informe se ele é divisível por 3 e por 7.

import java.util.Scanner;

public class ex24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int val1, div3, div7;
    div3 = 0;
    div7 = 0;
    System.out.print("digite o número: ");
    val1 = input.nextInt();

    div3 = val1 % 3;
    div7 = val1 % 7;

    if (div3 == 0 && div7 == 0) {
      System.out.println("É divisível por 3 e por 7");
    } else {
      System.out.println("Não é divisível por 3 ou por 7");
    }
    input.close();
  }
}