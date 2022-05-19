import java.util.Scanner;

public class ex27 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // var inicialization

    int age;

    // data entry
    System.out.print("Por favor, digite a idade: ");
    age = input.nextInt();

    if (age < 16) {
      System.out.println("Não pode votar");
    } else if (age >= 18 && age < 65) {
System.out.println("Obrigatório");
  } else {
    System.out.println("voto facultativo");
  }
}
}