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