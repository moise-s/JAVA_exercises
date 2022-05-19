import java.util.Scanner;

public class ex26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization

    int val1, val2, val3;

    // data entry
    System.out.print("Por favor, digite o primeiro número inteiro: ");
    val1 = input.nextInt();
    System.out.print("Por favor, digite o segundo número inteiro: ");
    val2 = input.nextInt();
    System.out.print("Por favor, digite o terceiro número inteiro: ");
    val3 = input.nextInt();

    if (val1 >= 0 && val2 >= 0 && val3 >= 0) {
      System.out.println("não há números negativos");
    } else if (val1 < 0 && val2 < 0 && val3 < 0) {
      System.out.println("os 3 valores são negativos");
    } else if ((val1 < 0 && val2 < 0) || (val1 < 0 && val3 < 0) || (val1 < 0 && val2 < 0)) {
      System.out.println("há 2 números negativos");
    } else {
      System.out.println("há 1 número negativo");
    }

  }
}