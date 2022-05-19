import java.util.Scanner;

public class ex1SWITCHCASE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double initPrice, finalPrice, lowinitPriceFare, highinitPriceFare, tax, finalFare;
    int category = 0;
    String classification = "";
    String situation = "x";

    lowinitPriceFare = 0;
    highinitPriceFare = 0;
    finalFare = 0;

    System.out.print("Digite o preço: ");
    initPrice = input.nextDouble();

    while (category != 1 && category != 2 && category != 3) {
      System.out.print("Digite a categoria [1 Limpeza, 2 alimentação, 3 vestuário]: ");
      category = input.nextInt();
    }

    input.nextLine();

    while (!(situation.equals("R")) && !(situation.equals("N"))) {
      System.out.print("Digite necessidade de refrigeração [R refrigeração, N sem refrigeração]: ");
      situation = input.nextLine();
    }

    switch (category) {
      case 1:
        lowinitPriceFare = 0.05;
        highinitPriceFare = 0.12;
        break;

      case 2:
        lowinitPriceFare = 0.08;
        highinitPriceFare = 0.15;
        break;

      case 3:
        lowinitPriceFare = 0.1;
        highinitPriceFare = 0.18;
        break;
    }

    if (category == 2 || situation.equals("R")) {
      tax = 0.05;
    } else {
      tax = 0.08;
    }

    if (initPrice <= 25) {
      finalFare = lowinitPriceFare;
    } else {
      finalFare = highinitPriceFare;
    }

    finalPrice = initPrice * (1 + finalFare - tax);

    if (finalPrice <= 50) {
      classification = "Barato";
    } else if (finalPrice < 120) {
      classification = "Normal";
    } else {
      classification = "Caro";
    }

    System.out.println("Valor do aumento é: R$ " + finalFare * initPrice);
    System.out.println("Valor do imposto é: R$ " + tax * initPrice);
    System.out.println("Novo preço é: R$ " + finalPrice);
    System.out.println("A classificação do produto é: " + classification);
  }
}
