import java.util.Scanner;

public class ex34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    double peso;
    int idade, doseMg, gotas;
    doseMg = 0;

    System.out.print("Por favor digite sua idade ");
    idade = input.nextInt();
    System.out.print("Por favor digite seu peso (em Kg) ");
    peso = input.nextDouble();

    if (idade >= 12) {
      if (peso >= 60) {
        doseMg = 1000;
      } else {
        doseMg = 875;
      }
    } else {
      if (peso < 5) {
        doseMg = 0;
      } else if (peso >= 5 && peso <= 9) {
        doseMg = 125;
      } else if (peso <= 16) {
        doseMg = 250;
      } else if (peso <= 24) {
        doseMg = 375;
      } else if (peso < 30) {
        doseMg = 500;
      } else if (peso >= 30) {
        doseMg = 750;
      } 
    }

    // conversion mg -> drop
    gotas = doseMg / 25;

    System.out.println("O paciente deverá tomar " + gotas + " gotas!");

  }
}