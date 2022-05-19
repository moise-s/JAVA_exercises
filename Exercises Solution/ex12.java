import java.util.Scanner;

public class ex12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a, b, c;

    System.out.print("Digite o PRIMEIRO número: ");
    a = input.nextInt();
    System.out.print("Digite o SEGUNDO número: ");
    b = input.nextInt();
    System.out.print("Digite o TERCEIRO número: ");
    c = input.nextInt();

    if (a < b) {
      if (b < c) {
        System.out.println(a + " " + b + " " + c);
      } else if (a < c) {
        System.out.println(a + " " + c + " " + b);
      } else {
        System.out.println(c + " " + a + " " + b);
      }
    } else if (b < c) {
      if (a < c) {
        System.out.println(b + " " + a + " " + c);

      } else {
        System.out.println(b + " " + c + " " + a);
      }
    } else {
      System.out.println(c + " " + b + " " + a);
    }
  }
}
