package example01.srp.cartao.refactoring;

public class CalculoAnuidadeCartaoBlack implements ICalculoAnuidadeCartao {

  private final int CINQUENTA_MIL = 50000;
  private final int TRINTA_MIL = 30000;

  @Override
  public double calcular(Cliente cliente) {
    if (cliente.getTotalGastoUltimoAno() > CINQUENTA_MIL && cliente.temContaBancaria()) {
      return 0;
    } else if (cliente.getTotalGastoUltimoAno() > TRINTA_MIL) {
      return 300;
    } else {
      return 800;
    }
  }
}
