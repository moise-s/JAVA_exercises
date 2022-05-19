import java.util.Scanner;

import javax.print.event.PrintEvent;

public class ex2DIWHILE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    int option;
    double salary, taxPercentage, tax, rise, salaryAftertax, salaryAfterRise;
    String classification;

    // initialization
    salary = 0;
    taxPercentage = 0;
    tax = 0;
    rise = 0;
    salaryAftertax = 0;
    classification = "";

    System.out.println("Menu de opções");
    System.out.println("1 - imposto");
    System.out.println("2 - novo salário");
    System.out.println("3 - classificação");
    System.out.println("4 - Finalizar o programa");
    System.out.print("Digite a opção desejada:  ");
    option = input.nextInt();

    do {

      while (option == 1) {
        System.out.print("Digite o salário do funcionário: R$ ");
        salary = input.nextDouble();
        if (salary < 500) {
          taxPercentage = 0.05;
        } else if (salary < 850) {
          taxPercentage = 0.1;
        } else {
          taxPercentage = 0.15;
        }

        salaryAftertax = salary * (1 - taxPercentage);
        tax = salary * taxPercentage;

        System.out.println("O percentual do imposto é " + taxPercentage * 100 + "%");
        System.out.println("O valor do imposto é de: R$ " + tax);
        System.out.println("O salário final é de: R$ " + salaryAftertax);

        System.out.print("Digite a opção desejada do programa:  ");
        option = input.nextInt();
      }

      while (option == 2) {
        System.out.print("Digite o salário do funcionário: R$ ");
        salary = input.nextDouble();

        if (salary < 450) {
          rise = 100;
        } else if (salary < 750) {
          rise = 75;
        } else if (salary <= 1500) {
          rise = 50;
        } else {
          rise = 250;
        }

        salaryAfterRise = salary + rise;

        System.out.println("O salário, PRÉ aumento, é de: R$ " + salary);
        System.out.println("O salário, PÓS aumento, é de: R$ " + salaryAfterRise);
        System.out.println("O aumento foi de: R$ " + rise);

        System.out.print("Digite a opção desejada do programa:  ");
        option = input.nextInt();
      }

      while (option == 3) {
        System.out.print("Digite o salário do funcionário: R$ ");
        salary = input.nextDouble();

        if (salary < 700) {
          classification = "Mal remunerado";
        } else {
          classification = "Bem remunerado";
        }

        System.out.println("Sua classificação é de " + classification);

        System.out.print("Digite a opção desejada do programa:  ");
        option = input.nextInt();

      }

    } while (option < 4);

    System.out.println("Obrigado por usar o programa!");

  }
}