public class main {
  public static void main(String[] args) {
    Cliente moises = new Cliente();
    moises.setNome("Moisés");

    Conta cc = new ContaCorrente(moises);
    Conta poupanca = new ContaPoupanca(moises);

    cc.depositar(100);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }

}
