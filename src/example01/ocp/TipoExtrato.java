package example01.ocp;

public enum TipoExtrato {
  CONTA_CORRENTE, CONTA_POUPANCA, CONTA_INVESTIMENTO;

  public boolean isContaCorrente(){
    return this.equals(CONTA_CORRENTE);
  }
  public boolean isContaPoupanca(){
    return this.equals(CONTA_POUPANCA);
  }
}
