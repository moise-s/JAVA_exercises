import java.util.Scanner;

public class ex32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    double valorCompra, valorVenda, lucro;

    System.out.print("Por favor digite o valor de compra ");
    valorCompra = input.nextDouble();

    if (valorCompra < 10) {
      lucro = 0.7;
    } else if (valorCompra >=10 && valorCompra < 30) {
      lucro = 0.5;
    } else if (valorCompra >=30 && valorCompra < 50) {
      lucro = 0.4;
    } else {
      lucro = 0.3;
    }

    valorVenda = (1 + lucro) * valorCompra;
    System.out.println("O valor a ser vendido é de R$ " + valorVenda);

  }
}