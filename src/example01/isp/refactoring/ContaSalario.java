package example01.isp.refactoring;

public class ContaSalario implements IContaBasica {

  @Override
  public void sacarContaCorrente(long conta) {
    // consulta saldo
    //  efetua saque
  }

  @Override
  public void depositarContaCorrente(double valor, long conta) {
    // deposita valor
  }
}
