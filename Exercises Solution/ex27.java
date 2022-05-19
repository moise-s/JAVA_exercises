// Desenvolva um programa que dada a idade de uma pessoa, determine sua condição de eleitor conforme a tabela abaixo:
// Idade	Condição
// Menor que 16 anos	Não pode votar
// Maior ou igual a 16 e menor que 18 anos ou maior ou igual a 65 anos	Facultativo
// Entre 18 e 64 anos 	Obrigatório

import java.util.Scanner;

public class ex27 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization

    int age;

    // data entry
    System.out.print("Por favor, digite a idade: ");
    age = input.nextInt();

    if (age < 16) {
      System.out.println("Não pode votar");
    } else if (age >= 18 && age < 65) {
System.out.println("Obrigatório");
  } else {
    System.out.println("voto facultativo");
  }
}
}