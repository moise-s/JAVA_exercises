// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.

import java.util.Scanner;

public class ex16 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double val1, val2, val3;

    System.out.print("Digite o valor 1: ");
    val1 = input.nextDouble();
    System.out.print("Digite o valor 2: ");
    val2 = input.nextDouble();
    System.out.print("Digite o valor 3: ");
    val3 = input.nextDouble();

    if (val1 > val2) {
      if (val1 > val3) {
        System.out.println("O maior valor é o " + val1);
      } else {
        System.out.println("O maior valor é o " + val3);
      }
    }
    if (val2 > val1) {
      if (val2 > val3) {
        System.out.println("O maior valor é o " + val2);
      } else {
        System.out.println("O maior valor é o " + val3);
      }
    }
  }
}