package example01.srp.conta;

public interface IContaService {

  void sacarContaCorrente(long conta);

  void depositarContaCorrente(double valor, long conta);

  void transferirContaCorrenteParaOutroBanco(String cpfDestinario, long agenciaDestinatario,
      long contaDestinatario, long bancoDestinatario, long contaTransferente);

  String emitirExtratoContaCorrente(int contaCorrente);

  void sacarContaPoupanca(int conta);

  void depositarContaPoupanca(double valor, int conta);

  void transferirPoupancaParaOutroBanco(String cpfDestinario, long agenciaDestinatario,
      long contaDestinatario, long bancoDestinatario, long contaTransferente);

  String emitirExtratoPoupanca(long contaCorrente);

  void transferirContaCorrenteParaMesmoBanco(long contaDestinario, long contaTransferente);

  void transferirContaPoupancaParaMesmoBanco(long contaDestinario, long contaTransferente);

}
