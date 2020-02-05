package example01.ocp.refactoring;

public class EmissaoExtratoContaInvestimento extends EmissaoExtrato {

  @Override
  StringBuilder definirCabecalho() {
    return new StringBuilder().append("Extrato para Conta de Invesimento...");
  }

  @Override
  StringBuilder definirCorpo() {
    return new StringBuilder()
        .append("Abaixo compras de ativos XXXXX").append("\n")
        .append("Abaixo venda de ativos XXXX").append("\n")
        .append("Abaixo recebimento de dividendos dos ativos XXXX").append("\n");
  }

  @Override
  StringBuilder definirRodape() {
    return new StringBuilder()
        .append("Total de rendimento YYY").append("\n")
        .append("Total de investido YYY");
  }
}
