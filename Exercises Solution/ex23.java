// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

import java.util.Scanner;

public class ex23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int val1, div;
    div = 0;

    System.out.print("digite o número: ");
    val1 = input.nextInt();

    div = val1 % 3;

    if (div == 0) {
      System.out.println("É divisível por 3");
    } else {
      System.out.println("Não é divisível por 3");
    }

  }
}