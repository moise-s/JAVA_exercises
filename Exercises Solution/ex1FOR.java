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
