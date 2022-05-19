import java.util.Scanner;

public class ex6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double salCarlos, salJoao, contPoup, renFixa;
    int time = 0;

    // TYPE CARLOS SALARY
    System.out.print("Por favor, digite o salário de Carlos: ");
    salCarlos = input.nextDouble();

    // CALCULATION
    salJoao = salCarlos / 3;
    contPoup = salCarlos;
    renFixa = salJoao;

    // LOOP
    while (contPoup > renFixa) {
      contPoup = contPoup * 1.02;
      renFixa = renFixa * 1.05;
      time++;
    }

    System.out.println("Levará " + time + " meses para que o valor de João ultrapasse o de Carlos");
  }
}
