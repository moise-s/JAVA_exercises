// Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M – matutino; V – vespertino; N – noturno), categoria (O – operário; ou G – gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, faça um programa que: a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informações dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas; b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o salário mínimo; c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas; d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme a tabela 2; e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação e salário final (salário inicial + auxílio alimentação).

import java.util.Scanner;

public class ex5 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // var declaration
    int i, code;
    double workedHours, hourValue, minWage, initSalary, mealTicket, finalSalary;
    String shift, category;

    // variable attribuition
    i = 1;
    minWage = 450;
    hourValue = 0;
    initSalary = 0;
    mealTicket = 0;

    // Greeting
    System.out.println("Bem-vinda(o) ao sistema da empresa X :)");

    // loop start
    while (i < 11) {
      System.out.println("Digite as informações do funcionário " + i);

      // CODE
      System.out.print("Código do funcionário: ");
      code = input.nextInt();

      // WORKED HOURS
      System.out.print("Horas trabalhadas no mês: ");
      workedHours = input.nextDouble();

      // WORK SHIFT
      System.out.print("Turno de trabalho (apenas M matutino; V vespertino; N noturno): ");
      shift = input.next();

      // if entry is != from (M, V, N), then:
      while (!(shift.equals("M")) && !(shift.equals("V")) && !(shift.equals("N"))) {
        System.out.println("Por favor, digite abaixo apenas M, V ou N");
        System.out.print("Turno de trabalho: ");
        shift = input.next();
      }
      // JOB CATEGORY
      System.out.print("Categoria de trabalho (apenas O operário; G gerente): ");
      category = input.next();

      // if entry is != from (M, V, N), then:
      while (!(category.equals("O")) && !(category.equals("G"))) {
        System.out.println("Por favor, digite abaixo apenas O ou G");
        System.out.print("Categoria de trabalho: ");
        category = input.next();
      }

      // HOUR VALUE CALC
      if (category.equals("G")) {
        if (shift.equals("N")) {
          hourValue = minWage * 0.18;
        } else {
          hourValue = minWage * 0.15;
        }
      }
      if (category.equals("O")) {
        if (shift.equals("N")) {
          hourValue = minWage * 0.13;
        } else {
          hourValue = minWage * 0.10;
        }
      }

      // INITIAL SALARY CALCULATION
      initSalary = hourValue * workedHours;

      // MEAL TICKET
      if (initSalary > 600) {
        mealTicket = initSalary * 0.05;
      } else if (initSalary > 300) {
        mealTicket = initSalary * 0.15;
      } else {
        mealTicket = initSalary * 0.2;
      }

      // FINAL SALARY CALCULATION
      finalSalary = initSalary + mealTicket;

      // PRINT VALUES
      System.out.println(i + ") As informações deste funcionário são as seguintes:");
      System.out.println("Código: " + code);
      System.out.println("Número de horas trabalhadas: " + workedHours);
      System.out.println("Valor da hora trabalhada: R$ " + hourValue);
      System.out.println("Salário inicial: R$ " + initSalary);
      System.out.println("Auxílio alimentação: R$ " + mealTicket);
      System.out.println("Salário final: R$ " + finalSalary);
      System.out.println("");

      // INCREMENT CONTER
      i++;
    }

  }
}