import java.util.Scanner;

public class ex30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    double valorCompra, valorVenda;

    System.out.print("Por favor digite o valor de compra: ");
    valorCompra = input.nextDouble();

    if (valorCompra < 20) {
      valorVenda = valorCompra * 1.45;
    } else {
      valorVenda = valorCompra * 1.3;
    }
    System.out.println("O valor de venda será: R$ " + valorVenda);

  }
}