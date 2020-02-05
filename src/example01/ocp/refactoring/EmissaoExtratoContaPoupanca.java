package example01.ocp.refactoring;

public class EmissaoExtratoContaPoupanca extends EmissaoExtrato {

  @Override
  StringBuilder definirCabecalho() {
    return new StringBuilder().append("Extrato para Conta Poupança...");
  }

  @Override
  StringBuilder definirCorpo() {
    return new StringBuilder()
        .append("Abaixo valores aplicados XXXXX").append("\n")
        .append("Abaixo resgates efetuados XXXX").append("\n");
  }

  @Override
  StringBuilder definirRodape() {
    return new StringBuilder().append("Saldo total YYY");
  }
}
