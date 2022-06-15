// Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class ex8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double val1, val2;

    System.out.println("digite 2 valores DIFERENTES!!!!");
    System.out.print("Por favor digite o primeiro número: ");
    val1 = input.nextDouble();
    System.out.print("Por favor digite o segundo número: ");
    val2 = input.nextDouble();

    if (val1 > val2) {
      System.out.println("o maior valor é: " + val1);
    } else {
      System.out.println("o maior valor é: " + val2);
    }
    input.close();
  }
}