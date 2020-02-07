package example01.lsp.refactoring;

public class ContaPoupanca implements IConta {

  private double saldo;
  private final int TAXA_TED = 10;

  public ContaPoupanca(double saldo) {
    this.saldo = saldo;
  }


  @Override
  public void transferir(double valor) {
    {
      this.saldo = this.saldo - (valor + TAXA_TED);
    }
  }

  @Override
  public double mostrarSaldo() {
    return this.saldo;
  }
}
