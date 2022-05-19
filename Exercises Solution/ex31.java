// Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a tabela a seguir. Desenvolva um programa que dada a idade de uma pessoa, imprima o valor que ela deverá pagar.
// Até 10 anos: R$ 30,00
// Acima de 10 até 29 anos: R$ 60,00
// Acima de 29 até 45 anos: R$ 120,00
// Acima de 45 até 59 anos: R$ 150,00
// Acima de 59 até 65 anos: R$ 250,00
// Maior que 65 anos: R$ 400,00

import java.util.Scanner;

public class ex31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    int age;
    double valor;

    System.out.print("Por favor digite a idade ");
    age = input.nextInt();

    if (age <= 10) {
      valor = 30;
    } else if (age > 10 && age <= 29) {
      valor = 60;
    } else if (age > 29 && age <= 45) {
      valor = 120;
    } else if (age > 45 && age <= 59) {
      valor = 150;
    } else if (age > 59 && age <= 65) {
      valor = 250;
    } else {
      valor = 400;
    }

    System.out.println("O valor a ser pago é de R$ " + valor);

  }
}