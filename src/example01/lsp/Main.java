package example01.lsp;

public class Main {

  public static void main(String[] args) {
    var contaPoupanca = new ContaPoupanca(100);
    var contaCorrente = new ContaCorrente(100);

    transferir(contaPoupanca);
    transferir(contaCorrente);


  }

  private static void transferir(ContaCorrente contaCorrente) {
    //Espera que cobre a taxa da conta corrente ou da poupança?
    //Para "corrigir" será necessário fazer  um  instanceof
    contaCorrente.transferir(100);
    System.out.println(contaCorrente.saldo);
  }

}
