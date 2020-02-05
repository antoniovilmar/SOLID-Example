package example01.ocp.refactoring;

public class EmissaoExtratoContaCorrente extends EmissaoExtrato {

  @Override
  StringBuilder definirCabecalho() {
    return new StringBuilder().append("Extrato para Conta Corrente...");
  }

  @Override
  StringBuilder definirCorpo() {
    return new StringBuilder()
        .append("Abaixo depósitos efetuados XXXXX").append("\n")
        .append("Abaixo saques efetuados XXXX").append("\n");
  }

  @Override
  StringBuilder definirRodape() {
    return new StringBuilder().append("Saldo total YYY");
  }
}
