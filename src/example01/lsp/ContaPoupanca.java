package example01.lsp;

public class ContaPoupanca extends ContaCorrente {

  private final int TAXA_TED = 10;

  public ContaPoupanca(double saldo) {
    super(saldo);
  }

  public void transferir(double valor) {
    saldo = saldo - (valor + TAXA_TED);
  }
}
