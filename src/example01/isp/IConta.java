package example01.isp;

public interface IConta {

  void sacarContaCorrente(long conta);

  void depositarContaCorrente(double valor, long conta);

  void transferirOutroBanco(String cpfDestinario, long agenciaDestinatario,
      long contaDestinatario, long bancoDestinatario, long contaTransferente);

  void transferirParaMesmoBanco(long contaDestinario, long contaTransferente);

}
