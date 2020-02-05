package example01.ocp;

import example01.ocp.refactoring.EmissaoExtratoContaCorrente;

public class Main {

  public static void main(String[] args) {

//    var emissaoExtrato = new EmissaoExtrato();
//
//    System.out.println(emissaoExtrato.emitir(TipoExtrato.CONTA_CORRENTE));

    var emissaoExtratoRefatorado = new EmissaoExtratoContaCorrente();
    System.out.println(emissaoExtratoRefatorado.emitir());
  }


}
