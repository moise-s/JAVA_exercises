// Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero.

import java.util.Scanner;

public class ex3DOWHILE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    double age, average, acc, j;
    age = 0;
    average = 0;
    j = 1;
    acc = 0;

    // initialization
    System.out.print("Digite a idade: ");
    age = input.nextInt();

    do {
      acc = acc + age;
      average = acc / j;

      System.out.println("A média é: " + average);

      j++;

      System.out.print("Digite a idade: ");
      age = input.nextInt();
    } while (age != 0);

    System.out.println("Obrigado por usar o programa!");
    input.close();
  }
}