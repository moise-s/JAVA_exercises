import java.util.Scanner;

public class ex29 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization

    double p1, p2, p3, freq, media;
    int aulas, faltas, presenca;

    // data entry
    System.out.print("Por favor, digite a nota da P1: ");
    p1 = input.nextDouble();
    System.out.print("Por favor, digite a nota da P2: ");
    p2 = input.nextDouble();
    System.out.print("Por favor, digite a nota da P3: ");
    p3 = input.nextDouble();
    System.out.print("Por favor, digite o total de AULAS: ");
    aulas = input.nextInt();
    System.out.print("Por favor, digite o total de FALTAS: ");
    faltas = input.nextInt();

    // calculation
    media = (p1 + p2 + p3) / 3;
    presenca = aulas - faltas;
    freq = 100 * (presenca / aulas);

    // conditions
    if (freq < 75 || media < 3) {
      System.out.println("REPROVADO");
    } else if (media >=3 && media < 7) {
      System.out.println("EXAME");
    } else {
      System.out.println("APROVADO");
    }
  }
}