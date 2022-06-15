// Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Desenvolva um programa que dado o valor do produto, imprimir o valor de venda.

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
    input.close();
  }
}