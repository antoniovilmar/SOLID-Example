package example01.srp.cartao.refactoring;

public enum ModalidadeCartao {
  BLACK(new CalculoAnuidadeCartaoBlack()),
  GOLD(new CalculoAnuidadeCartaoBlack()),
  INTERNACIONAL(new CalculoAnuidadeCartaoInternacional());

  private ICalculoAnuidadeCartao calculaAnuidadeCartao;

  ModalidadeCartao(ICalculoAnuidadeCartao calculaAnuidadeCartao) {
    this.calculaAnuidadeCartao = calculaAnuidadeCartao;
  }

  public ICalculoAnuidadeCartao getCalculaAnuidadeCartao() {
    return calculaAnuidadeCartao;
  }
}
