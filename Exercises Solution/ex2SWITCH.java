// Faça um programa que receba:
// O código do produto comprado; e
// A quantidade comprada do produto.
// Calcule e mostre:
// O preço unitário do produto comprado, seguindo a Tabela abaixo;
// O preço total da nota;
// O valor do desconto, seguindo a Tabela abaixo e aplicado sobre o preço total da nota; e
// O preço final da nota depois do desconto

import java.util.Scanner;

public class ex2SWITCH {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    int code, quantity, section;
    double initTotalPrice, discount, discountedPrice, finalTotalPrice, itemPrice;

    // initialization
    section = 0;
    itemPrice = 0;
    quantity = 0;
    code = 0;
    discountedPrice = 0;

    // entries
    while (code < 1 || code > 40) {
      System.out.print("Por favor digite o código do produto [1 à 40]: ");
      code = input.nextInt();
    }

    while (quantity <= 0) {
      System.out.print("Por favor digite a quantidade do produto [>0]: ");
      quantity = input.nextInt();
    }

    if (code >= 1 && code <= 10) {
      section = 1;
    } else if (code <= 20) {
      section = 2;
    } else if (code <= 30) {
      section = 3;
    } else if (code <= 40) {
      section = 4;
    }

    switch (section) {
      case 1:
        itemPrice = 10;
        break;

      case 2:
        itemPrice = 15;
        break;

      case 3:
        itemPrice = 20;
        break;

      case 4:
        itemPrice = 30;
        break;

      default:
        System.out.print("Por favor, tente novamente! :(");
    }

    // initial equation
    initTotalPrice = itemPrice * quantity;

    if (initTotalPrice < 250) {
      discount = 0.05;
    } else if (initTotalPrice < 500) {
      discount = 0.1;
    } else {
      discount = 0.15;
    }

    // equations
    finalTotalPrice = (1 - discount) * initTotalPrice;
    discountedPrice = initTotalPrice * discount;

    // initTotalPrice, discount, discountedPrice, finalTotalPrice, itemPrice

    System.out.println("O preço unitário do produto comprado é: R$ " + itemPrice);
    System.out.println("O preço total da nota é: R$ " + initTotalPrice);
    System.out.println("O valor do desconto é: R$ " + discountedPrice);
    System.out.println("O preço final da compra é: R$ " + finalTotalPrice);

  }
}