package example01.lsp.refactoring;


public class Main {

  public static void main(String[] args) {
    var contaPoupanca = new ContaPoupanca(100);
    var contaCorrente = new ContaCorrente(100);

    transferir(contaPoupanca);
    transferir(contaCorrente);


  }

  private static void transferir(IConta conta) {
    conta.transferir(100);
    System.out.println(conta.mostrarSaldo());
  }

}
