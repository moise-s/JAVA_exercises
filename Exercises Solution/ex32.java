// Um comerciante calcula o valor de venda, tendo em vista a tabela a seguir:
// Valor da compra	Valor da venda
// < 10,00	Lucro de 70%
// >= 10,00 e < 30,00	Lucro de 50%
// >= 30,00 e < 50,00	Lucro de 40%
// >= 50,00	Lucro de 30%
// Crie um programa que possa entrar com o valor da compra e imprimir o valor da venda.

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
    } else if (valorCompra >= 10 && valorCompra < 30) {
      lucro = 0.5;
    } else if (valorCompra >= 30 && valorCompra < 50) {
      lucro = 0.4;
    } else {
      lucro = 0.3;
    }

    valorVenda = (1 + lucro) * valorCompra;
    System.out.println("O valor a ser vendido é de R$ " + valorVenda);
    input.close();
  }
}