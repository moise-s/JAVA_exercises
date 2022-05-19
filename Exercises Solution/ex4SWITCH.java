import java.util.Scanner;

public class ex4SWITCH {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // variables
    int operation;
    double num1, num2, result;

    // initialization
    result = 0;
    operation = 0;

    // entries
    System.out.print("Digite o primeiro número: ");
    num1 = input.nextDouble();

    System.out.print("Digite o segundo número: ");
    num2 = input.nextDouble();

    while (operation < 1 || operation > 4) {
      System.out.print("Digite a operação desejada [1-4]: ");
      operation = input.nextInt();
    }

    // switch
    switch (operation) {
      case 1:
        result = (num1 + num2) / 2;
        break;

      case 2:
        result = Math.abs(num1 - num2);
        break;

      case 3:
        result = num1 * num2;
        break;

      case 4:
        result = num1 / num2;
        break;
    }

    // sys out
    System.out.println("O resultado da operação é: " + result);

  }
}