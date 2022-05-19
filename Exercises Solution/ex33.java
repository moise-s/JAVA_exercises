// Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso, se utiliza do Índice de Massa Corporal (IMC). Sabendo-se que o IMC é calculado através da seguinte fórmula:
// IMC = peso / altura2
// Onde: 
// peso é dado em Kg
// altura é dada em metros
// Crie um programa que dados o peso e altura do paciente, exiba sua faixa de risco, baseando-se na seguinte tabela:
// IMC	Faixa de risco
// Abaixo de 20	Abaixo do peso
// A partir de 20 até 25	Normal
// Acima de 25 até 30	Excesso de peso
// Acima de 30 até 35	Obesidade
// Acima de 35	Obesidade mórbida

import java.util.Scanner;

public class ex33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    double peso, altura, imc;
    String imcCat;

    System.out.print("Por favor digite seu peso (em Kg) ");
    peso = input.nextDouble();
    System.out.print("Por favor digite sua altura (em m) ");
    altura = input.nextDouble();

    imc = peso / altura / altura;

    if (imc < 20) {
      imcCat = "Abaixo do Peso";
    } else if (imc < 25) {
      imcCat = "Normal";
    } else if (imc < 30) {
      imcCat = "Excesso de peso";
    } else if (imc < 35) {
      imcCat = "Obesidade";
    } else {
      imcCat = "Obesidade Mórbida";
    }

    System.out.println("Sua faixa de risco é: " + imcCat);

  }
}