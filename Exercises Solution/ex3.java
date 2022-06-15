// Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. Para idade inferior a 5, deverá mostrar mensagem.

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double idade;
    System.out.print("Digite sua idade: ");
    idade = input.nextDouble();

    if (idade > 30) {
      System.out.println("sua categoria é SENIOR");
    } else if (idade >= 16) {
      System.out.println("sua categoria é ADULTO");
    } else if (idade >= 11) {
      System.out.println("sua categoria é ADOLESCENTE");
    } else if (idade >= 8) {
      System.out.println("sua categoria é JUVENIL");
    } else if (idade >= 5) {
      System.out.println("sua categoria é INFANTIL");
    } else {
      System.out.println("Você é muito pequeno para nadar :(");
    }
    input.close();
  }
}