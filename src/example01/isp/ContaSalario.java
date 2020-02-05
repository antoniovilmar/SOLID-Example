package example01.isp;

public class ContaSalario implements IConta {

  @Override
  public void sacarContaCorrente(long conta) {
    // consulta saldo
    //  efetua saque
  }

  @Override
  public void depositarContaCorrente(double valor, long conta) {
    // deposita valor
  }

  @Override
  public void transferirOutroBanco(String cpfDestinario, long agenciaDestinatario,
      long contaDestinatario, long bancoDestinatario, long contaTransferente) {
    throw new IllegalArgumentException("Não é possível efetuar transferencia, serviço indisponivel");
  }

  @Override
  public void transferirParaMesmoBanco(long contaDestinario, long contaTransferente) {
   throw new IllegalArgumentException("Não é possível efetuar transferencia, serviço indisponivel");
  }
}
