import java.util.Scanner;

public class ex31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization
    int age;
    double valor;

    System.out.print("Por favor digite a idade ");
    age = input.nextInt();

    if (age <= 10) {
      valor = 30;
    } else if (age > 10 && age <= 29) {
      valor = 60;
    } else if (age > 29 && age <= 45) {
      valor = 120;
    } else if (age > 45 && age <= 59) {
      valor = 150;
    } else if (age > 59 && age <= 65) {
      valor = 250;
    } else {
      valor = 400;
    }

    System.out.println("O valor a ser pago é de R$ " + valor);

  }
}