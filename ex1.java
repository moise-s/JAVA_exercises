import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double horEx, horFal, H;

    System.out.println("Para realizar o cálculo, digite as seguintes informações:");

    System.out.print("Horas extra: ");
    horEx = input.nextDouble();

    System.out.print("Horas falta: ");
    horFal = input.nextDouble();

    H = horEx - (2 * horFal / 3);

    if (H >= 2401) {
      System.out.println("Sua bonificação é de R$ 500 !!");
    } else if (H >= 1801) {
      System.out.println("Sua bonificação é de R$ 400 !!");
    } else if (H >= 1201) {
      System.out.println("Sua bonificação é de R$ 300 !!");
    } else if (H >= 600) {
      System.out.println("Sua bonificação é de R$ 200 !!");
    } else {
      System.out.println("Sua bonificação é de R$ 100 !!");
    }
  }
}