package example01.isp.refactoring;

public interface IConta extends IContaBasica {

  void transferirOutroBanco(String cpfDestinario, long agenciaDestinatario,
      long contaDestinatario, long bancoDestinatario, long contaTransferente);

  void transferirParaMesmoBanco(long contaDestinario, long contaTransferente);

}
