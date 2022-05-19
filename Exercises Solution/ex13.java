// Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes Fórmulas:

// para homens: (72.7 * Altura) – 58
// para mulheres: (62.1 * Altura) – 44.7

import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int sexo, i;
    double altura, pesoIdeal;
    pesoIdeal = 0;

    System.out.print("Digite sua altura: ");
    altura = input.nextDouble();
    System.out.print("Digite sua sexo (1 Fem e 2 Masc): ");
    sexo = input.nextInt();

    while (sexo != 1 && sexo != 2) {
      System.out.print("Tente novamente (1 Fem e 2 Masc): ");
      sexo = input.nextInt();
    }

    if (sexo == 1) {
      pesoIdeal = 62.1 * altura - 44.7;
    } else if (sexo == 2) {
      pesoIdeal = 72.7 * altura - 58;
    }
    System.out.println("Seu peso ideal é de " + pesoIdeal + " Kg");
  }
}