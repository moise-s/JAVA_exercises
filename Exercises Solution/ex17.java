// Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
// Sendo que:
// Triângulo Equilátero: possui os 3 lados iguais.
// Triângulo Isóscele: possui 2 lados iguais.
// Triângulo Escaleno: possui 3 lados diferentes.

import java.util.Scanner;

public class ex17 {  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int val1, val2, val3;

    System.out.print("Digite o valor do lado 1: ");
    val1 = input.nextInt();
    System.out.print("Digite o valor do lado 2: ");
    val2 = input.nextInt();
    System.out.print("Digite o valor do lado 3: ");
    val3 = input.nextInt();

    if (val1 == val2 && val1 == val3) {
      System.out.println("Triângulo Equilátero!");
    } else if (val1 == val2 || val1 == val3 || val2 == val3) {
      System.out.println("Triângulo Isósceles!");
    } else {
      System.out.println("Triângulo Escaleno!");
    }

  }
}