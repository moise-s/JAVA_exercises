// Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no número de horas extras e no número de horas que o funcionário faltou ao trabalho. O valor do prêmio é obtido pela consulta na tabela a seguir, em que:
// H = (número de horas extras) – 2/3 * (número de horas-falta)
// Faça um programa que receba o número de horas extras e o número de horas-falta de um funcionário e imprima o valor de sua gratificação.

import java.util.Scanner;

public class ex36 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double horEx, horFal, H;

    System.out.println("Para realizar o cálculo, digite as seguintes informações:");

    System.out.print("Horas extra: ");
    horEx = input.nextDouble();

    System.out.print("Horas falta: ");
    horFal = input.nextDouble();

    H = horEx - (2 * horFal / 3);

    if (H > 2400) {
      System.out.println("Sua bonificação é de R$ 500 !!");
    } else if (H >= 1800) {
      System.out.println("Sua bonificação é de R$ 400 !!");
    } else if (H >= 1200) {
      System.out.println("Sua bonificação é de R$ 300 !!");
    } else if (H >= 600) {
      System.out.println("Sua bonificação é de R$ 200 !!");
    } else {
      System.out.println("Sua bonificação é de R$ 100 !!");
    }
  }
}