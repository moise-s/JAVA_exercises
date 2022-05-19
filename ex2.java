import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double idade, peso;
    System.out.print("Digite sua idade: ");
    idade = input.nextDouble();

    System.out.print("Digite seu peso: ");
    peso = input.nextDouble();

    if (idade > 50) {
      if (peso > 90) {
        System.out.println("seu grupo de risco é: 1");
      } else if (peso >= 60) {
        System.out.println("seu grupo de risco é: 2");
      } else {
        System.out.println("seu grupo de risco é: 3");
      }
    }
    if (idade >= 20 && idade <= 50) {
      if (peso > 90) {
        System.out.println("seu grupo de risco é: 4");
      } else if (peso >= 60) {
        System.out.println("seu grupo de risco é: 5");
      } else {
        System.out.println("seu grupo de risco é: 6");
      }
    }
    if (idade < 20) {
      if (peso > 90) {
        System.out.println("seu grupo de risco é: 7");
      } else if (peso >= 60) {
        System.out.println("seu grupo de risco é: 8");
      } else {
        System.out.println("seu grupo de risco é: 9");
      }
    }
  }
}
