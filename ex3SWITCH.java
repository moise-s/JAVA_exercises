import java.util.Scanner;

public class ex3SWITCH {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    double price;
    int code;
    String origin;

    // initialization
    price = 0;
    code = 0;
    origin = "";

    // entries
    while (price <= 0) {
      System.out.print("Digite o preço do produto: R$ ");
      price = input.nextDouble();
    }

    while (code < 1 || code > 30) {
      System.out.print("Digite o código de origem [1 à 30]: ");
      code = input.nextInt();
    }

    // switch
    switch (code) {
      case 1:
        origin = "Sul";
        break;

      case 2:
        origin = "Norte";
        break;

      case 3:
        origin = "Leste";
        break;

      case 4:
        origin = "Oeste";
        break;

      case 5:
      case 6:
        origin = "Nordeste";
        break;

      case 7:
      case 8:
      case 9:
        origin = "Sudeste";
        break;

      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
        origin = "Centro-Oeste";
        break;

      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
        origin = "Nordeste";
    }

    System.out.println("O preço é : R$" + price);
    System.out.println("A origem é: " + origin);
  }
}