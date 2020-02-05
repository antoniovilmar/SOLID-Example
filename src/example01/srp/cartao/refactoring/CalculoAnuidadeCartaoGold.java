package example01.srp.cartao.refactoring;

public class CalculoAnuidadeCartaoGold implements ICalculoAnuidadeCartao {

  private final int DOZE_MIL = 12000;

  @Override
  public double calcular(Cliente cliente) {
    if (cliente.getTotalGastoUltimoAno() > DOZE_MIL || cliente.temContaBancaria()) {
      return 0;
    }

    return 250;
  }
}
