package example01.srp.cartao.refactoring;

public class CalculoAnuidadeCartaoInternacional implements ICalculoAnuidadeCartao {

  @Override
  public double calcular(Cliente cliente) {
    if (cliente.temContaBancaria()) {
      return 0;
    }

    return 120;
  }
}
