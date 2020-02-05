package example01.isp.refactoring;

public class ContaCorrente implements IConta {

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
    // verifica saldo
    // verifica cpf do destinatário informado e da titularidade de destino
    // tira dinheiro
    // adiciona na conta de destino

  }

  @Override
  public void transferirParaMesmoBanco(long contaDestinario, long contaTransferente) {
    // verifica saldo
    // tira dinheiro
    // adiciona na conta de destino
  }

}
