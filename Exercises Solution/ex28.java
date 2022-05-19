// Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.

import java.util.Scanner;

public class ex28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization

    int yearIn, monthIn, dayIn, year, month, day, age;
    year = 2022;
    month = 5;
    day = 13;
    age = 0;

    // data entry
    System.out.print("Por favor, digite o dia de nascimento: ");
    dayIn = input.nextInt();
    System.out.print("Por favor, digite o mês de nascimento: ");
    monthIn = input.nextInt();
    System.out.print("Por favor, digite o ano de nascimento: ");
    yearIn = input.nextInt();


    if (monthIn == month && day >= dayIn) {
      age = year - yearIn;
      System.out.println("Sua idade é " + age);
    } else if (month > monthIn) {
      age = year - yearIn;
      System.out.println("Sua idade é " + age);
    } else {
      age = year - yearIn - 1;
      System.out.println("Sua idade é " + age);
    }

  }
}