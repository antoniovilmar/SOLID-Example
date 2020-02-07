package example01.srp.refactoring;

public class Cliente {

  private ModalidadeCartao modalidadeCartao;

  private boolean correntista;

  public double getTotalGastoUltimoAno() {
    return totalGastoUltimoAno;
  }

  private double totalGastoUltimoAno;

  public ModalidadeCartao getModalidadeCartao() {
    return modalidadeCartao;
  }

  public boolean temContaBancaria() {
    return correntista;
  }

  public double getAnuidadeCartao() {
    return this.modalidadeCartao.getCalculaAnuidadeCartao().calcular(this);
  }

}
