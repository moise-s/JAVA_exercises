// A StackX abriu uma linha de crédito para os alunos. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa que permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informar o
// valor da parcela e se o empréstimo pode ou não ser concedido. Caso o empréstimo não possa ser concedido, informar ainda o valor máximo da prestação.

import java.util.Scanner;

public class ex25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    double salBruto, valEmp, valPrest, valPresMax;
    int numParc;

    // data entry
    System.out.print("Por favor, digite o salário bruto: ");
    salBruto = input.nextDouble();
    System.out.print("Por favor, digite o valor do empréstimo: ");
    valEmp = input.nextDouble();
    System.out.print("Por favor, digite o número de parcelas: ");
    numParc = input.nextInt();

    // define values
    valPresMax = salBruto * 0.3;
    valPrest = valEmp / numParc;

    // comparison
    if (valPresMax >= valPrest) {
      System.out.println("Empréstimo poderá ser concedido!!");
    } else {
      System.out.println("Não será possível lhe conceder empréstimo nessas condições :(");
    }

  }
}