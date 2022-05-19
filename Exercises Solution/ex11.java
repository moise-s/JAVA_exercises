import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int quant;
    double value;

    System.out.print("Digite a quantidade de maçãs você quer comprar: ");
    quant = input.nextInt();

    if (quant >= 12) {
      value = 0.25 * quant;
    } else {
      value = 0.3 * quant;
    }

    System.out.println("O valor de sua compra é de: R$ " + value);

  }
}
