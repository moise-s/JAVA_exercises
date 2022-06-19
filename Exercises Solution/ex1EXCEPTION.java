
// Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles exibindo seu resultado. Sua classe deve tratar as seguintes exceções:
// ArithmeticException quando ocorrer uma divisão por zero.
// InputMismatchException quando o valor informado não é numerico.
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1EXCEPTION {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a, b, result;

    try {
      System.out.print("Digite o primeiro número: ");
      a = input.nextInt();
      System.out.print("Digite o segundo número: ");
      b = input.nextInt();
      result = a / b;
      System.out.println("Resultado da divisão é: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Sua divisão foi inválida");
    } catch (InputMismatchException e) {
      System.out.println("Você deveria tar digitado um número");
    }

    input.close();
  }
}