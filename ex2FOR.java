import java.util.Scanner;

public class ex2FOR {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int entry, out;

    System.out.print("Digite o número que você quer verificar a tabuada: ");
    entry = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      out = i * entry;
      System.out.println("O resultado é " + entry + " x " + i + " = " + out);
    }

  }
}
