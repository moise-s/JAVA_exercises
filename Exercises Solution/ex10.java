import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int senha, x;
    x = 0;

    System.out.print("Digite a senha de acesso: ");
    senha = input.nextInt();

    while (x == 0) {
      if (senha == 1234) {
        System.out.println("ACESSO PERMITIDO");
        x++;
      } else {
        System.out.println("ACESSO NEGADO");
        System.out.print("Digite a senha de acesso: ");
        senha = input.nextInt();
      }
    }
  }
}