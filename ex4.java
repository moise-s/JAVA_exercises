import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double salBruto, salLiquido, bonificacao;
    System.out.print("Digite seu salário bruto: ");
    salBruto = input.nextDouble();

    if (salBruto > 901) {
      bonificacao = 35;
    } else if (salBruto >= 601) {
      bonificacao = 50;
    } else if (salBruto >= 351) {
      bonificacao = 75;
    } else {
      bonificacao = 100;
    }

    salLiquido = 0.93 * salBruto + bonificacao;

    System.out.println("Seu salário líquido, contando com bonificação é de: R$" + salLiquido);
  }
}
