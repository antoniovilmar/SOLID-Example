package example01.ocp;

public class EmissaoExtrato {

  public String emitir(TipoExtrato tipoExtrato) {

    var cabecalho = new StringBuilder();
    var corpo = new StringBuilder();
    var rodape = new StringBuilder();

    if (tipoExtrato.isContaCorrente()) {
      cabecalho.append("Extrato para Conta Corrente...");
      corpo.append("Abaixo depósitos efetuados XXXXX");
      corpo.append("Abaixo saques efetuados XXXX");
      rodape.append("Saldo total YYY");
    } else if (tipoExtrato.isContaPoupanca()) {
      cabecalho.append("Extrato para Conta Poupança...");
      corpo.append("Abaixo valores aplicados XXXXX");
      corpo.append("Abaixo resgates efetuados XXXX");
      rodape.append("Saldo total YYY");
    } else {
      cabecalho.append("Extrato para Conta de Invesimento...");
      corpo.append("Abaixo compras de ativos XXXXX");
      corpo.append("Abaixo venda de ativos XXXX");
      corpo.append("Abaixo recebimento de dividendos dos ativos XXXX");

      rodape.append("Total de rendimento YYY");
      rodape.append("Total de investido YYY");
    }

    return cabecalho.append("\n\n").append(corpo).append("\n\n").append(rodape).toString();

  }

}
