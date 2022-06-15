// Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo àquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa.
// Faça um programa que:
// a) Leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo);
// b) Calcule e mostre a porcentagem de audiência de cada canal.
// Para encerrar a entrada de dados, digite o número do canal zero.

import java.util.Scanner;

public class ex4DOWHILE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    int channel, people;
    double people4, people5, people7, people12, peopleTotal, audience4, audience5, audience7, audience12;

    peopleTotal = 0;
    people4 = 0;
    people5 = 0;
    people7 = 0;
    people12 = 0;
    audience4 = 0;
    audience5 = 0;
    audience7 = 0;
    audience12 = 0;

    // initialization
    do {
      input.nextLine();
      System.out.print("Digite o número do CANAL: ");
      channel = input.nextInt();
      System.out.print("Digite o número de PESSOAS: ");
      people = input.nextInt();

      if (channel == 4) {
        people4 = people;
      } else if (channel == 5) {
        people5 = people;
      } else if (channel == 7) {
        people7 = people;
      } else if (channel == 12) {
        people12 = people;
      }
      peopleTotal = peopleTotal + people;
      audience4 = people4 / peopleTotal;
      audience5 = people5 / peopleTotal;
      audience7 = people7 / peopleTotal;
      audience12 = people12 / peopleTotal;

      System.out.println("--- --- --- ---");
      System.out.println("Audiência do canal 4 é de " + audience4 * 100 + "%");
      System.out.println("Audiência do canal 5 é de " + audience5 * 100 + "%");
      System.out.println("Audiência do canal 7 é de " + audience7 * 100 + "%");
      System.out.println("Audiência do canal 12 é de " + audience12 * 100 + "%");
      System.out.println("--- --- --- ---");

    } while (channel != 0);
    input.close();
  }
}