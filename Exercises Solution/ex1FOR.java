// Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
// a) esse funcionário foi contratado em 2000, com salário inicial de R$1.000,00;
// b) Em 2001, ele recebeu aumento de 1,5%, sobre o seu salário inicial;
// c) A partir de 2002 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
// Faça um programa que determine o salário desse funcionário dos anos de 2000 à 2017. Apresente todos os valores.

public class ex1FOR {
  public static void main(String[] args) {
    double salarioIni, salarioFinal, aumento;
    int anoIni, anoFim, ano;

    salarioIni = 1000;
    salarioFinal = 1000;
    aumento = 0.015;
    anoIni = 2000;
    anoFim = 2017;
    ano = 2000;

    for (int i = 0; i <= (anoFim - anoIni); i++) {
      System.out.println("No ano de " + ano + " o salário é de R$ " + salarioFinal);
      salarioFinal = salarioFinal * (1 + aumento);
      aumento = aumento * 2;
      ano = 2001 + i;
    }

  }
}
