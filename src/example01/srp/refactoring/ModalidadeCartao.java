package example01.srp.refactoring;

public enum ModalidadeCartao {
  BLACK(new CalculoAnuidadeCartaoBlack()),
  GOLD(new CalculoAnuidadeCartao()),
  INTERNACIONAL(new CalculoAnuidadeCartaoInternacional());

  private ICalculoAnuidadeCartao calculaAnuidadeCartao;

  ModalidadeCartao(ICalculoAnuidadeCartao calculaAnuidadeCartao) {
    this.calculaAnuidadeCartao = calculaAnuidadeCartao;
  }

  public ICalculoAnuidadeCartao getCalculaAnuidadeCartao() {
    return calculaAnuidadeCartao;
  }
}
