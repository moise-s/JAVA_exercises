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