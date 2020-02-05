package example01.srp.cartao.refactoring;


public class CalculadoraAnuidadeCartao {

  public double calcular(Cliente cliente) {
    return cliente.getModalidadeCartao().getCalculaAnuidadeCartao().calcular(cliente);
  }
}
