package example01.lsp;

public class ContaCorrente {

  protected double saldo;
  private final int TAXA_TED = 5;

  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  public void transferir(double valor){
    this.saldo = this.saldo - (valor + TAXA_TED);
  }
}
