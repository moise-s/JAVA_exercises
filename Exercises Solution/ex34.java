// Criar um programa que a partir da idade e peso do paciente calcule a dosagem de determinado medicamento e imprima a receita informando quantas gotas do medicamento o paciente deve tomar por dose. Considere que o medicamento em questão possui 500 mg por ml, e que cada ml corresponde a 20 gotas.
// Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 Kg devem tomar 1000 mg; com peso abaixo de 60 Kg devem tomar 875 mg.
// Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo.

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
    input.close();
  }
}