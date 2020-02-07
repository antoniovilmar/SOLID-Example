package example01.lsp.refactoring;

public class ContaCorrente implements IConta {

  private double saldo;
  private final int TAXA_TED = 5;

  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  public void transferencia(double valor) {

  }

  @Override
  public void transferir(double valor) {
    this.saldo = this.saldo - (valor + TAXA_TED);
  }

  @Override
  public double mostrarSaldo() {
    return this.saldo;
  }
}
