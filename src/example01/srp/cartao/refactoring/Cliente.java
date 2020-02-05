package example01.srp.cartao.refactoring;

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

}
