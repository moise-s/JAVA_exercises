import java.util.Scanner;

public class ex4DOWHILE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    int channel, people;
    double people4, people5, people7, people12, audienceTotal, peopleTotal, audience4, audience5, audience7, audience12;

    peopleTotal = 0;
    people4 = 0;
    people5 = 0;
    people7 = 0;
    people12 = 0;
    audienceTotal = 0;
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

  }
}