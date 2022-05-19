import java.util.Scanner;

public class ex1DOWHILE {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double dimension1, dimension2, area;


do {
  System.out.print("Por favor, digite o valor da BASE do triângulo: ");
  dimension1 = input.nextDouble();
  System.out.print("Por favor, digite o valor da ALTURA do triângulo: ");
  dimension2 = input.nextDouble();

} while (dimension1 <= 0 && dimension2 <= 0);
area = dimension1 * dimension2 / 2;
System.out.println("A área do triângulo é de " + area);

  }
}