// Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
// Sendo que:
// Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
// Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
// TriânguloAcutângulo: possui três ângulos agudos. (menor que 90º

import java.util.Scanner;

public class ex18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int val1, val2, val3;

    System.out.print("Digite o valor do ângulo 1: ");
    val1 = input.nextInt();
    System.out.print("Digite o valor do ângulo 2: ");
    val2 = input.nextInt();
    System.out.print("Digite o valor do ângulo 3: ");
    val3 = input.nextInt();

    if (val1 == 90 || val2 == 90 || val3 == 90) {
      System.out.println("Triângulo retângulo");
    } else if (val1 > 90 || val2 > 90 || val3 > 90) {
      System.out.println("Triângulo obtusângulo");
    } else {
      System.out.println("Triângulo acutângulo");
    }
    input.close();
  }
}