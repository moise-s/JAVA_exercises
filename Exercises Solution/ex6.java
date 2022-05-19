// Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.

import java.util.Scanner;

public class ex6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double salCarlos, salJoao, contPoup, renFixa;
    int time = 0;

    // TYPE CARLOS SALARY
    System.out.print("Por favor, digite o salário de Carlos: ");
    salCarlos = input.nextDouble();

    // CALCULATION
    salJoao = salCarlos / 3;
    contPoup = salCarlos;
    renFixa = salJoao;

    // LOOP
    while (contPoup > renFixa) {
      contPoup = contPoup * 1.02;
      renFixa = renFixa * 1.05;
      time++;
    }

    System.out.println("Levará " + time + " meses para que o valor de João ultrapasse o de Carlos");
  }
}
