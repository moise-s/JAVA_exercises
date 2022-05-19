import java.util.Scanner;

public class ex3FOR {
  public static void main(String[] args) {

    double average1, average2, max, min, value1, value2, value3, acc1, acc2;
    int j1, j2;
    int[] code = { 1, 2, 3, 4, 5 };
    int[] vehicles = { 45, 665, 6987, 45, 983 };
    int[] accident = { 20, 45, 45, 1, 3 };

    average1 = 0;
    average2 = 0;
    max = 0;
    min = 99999;
    value1 = 0;
    value2 = 0;
    value3 = 0;
    j1 = 0;
    j2 = 0;
    acc1 = 0;
    acc2 = 0;

    for (int i = 0; i < 5; i++) {
      value1 = accident[i];
      if (value1 >= max) {
        max = value1;
      }
      if (value1 <= min) {
        min = value1;
      }
    }
    System.out.println("O maior índice de acidentes é " + max);
    System.out.println("O menor índice de acidentes é " + min);

    for (int i = 0; i < 5; i++) {
      value2 = vehicles[i];
      acc1 = acc1 + value2;
      j1++;
    }
    average1 = acc1 / j1;
    System.out.println("A média de veículos é de " + average1);

    for (int i = 0; i < 5; i++) {
      if (vehicles[i] < 2000) {
        value3 = accident[i];
        acc2 = acc2 + value3;
        j2++;
      }
    }
    average2 = acc2 / j2;

    System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é " + average2);

  }
}
