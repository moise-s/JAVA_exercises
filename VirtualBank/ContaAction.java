public interface ContaAction {

  void sacar(double valor);

  void depositar(double valor);

  void transferir(double valor, ContaAction contaDestino);

  void imprimirExtrato();

  default void transferir(double valor, Conta conta) {
    conta.sacar(valor);
    depositar(valor);
  }

}
