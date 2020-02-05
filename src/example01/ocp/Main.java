package example01.ocp;

import example01.ocp.refactoring.EmissaoExtratoContaCorrente;

public class Main {

  public static void main(String[] args) {

    var emissaoExtratoRefatorado = new EmissaoExtratoContaCorrente();
    var extrato = emissaoExtratoRefatorado.emitir();
    System.out.println(extrato);
  }


}
