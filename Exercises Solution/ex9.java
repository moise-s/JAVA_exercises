// Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

import java.util.Scanner;

public class ex9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ano, idade;

    System.out.print("digite o ano de nascimento: ");
    ano = input.nextInt();

    idade = 2022 - ano;

    if (idade >= 16) {
      System.out.println("Você poderá votar esse ano!");
    } else {
      System.out.println("Você não poderá votar esse ano... fica pra próxima");
    }
    input.close();
  }
}