package example01.dip.refactoring.domain;

public class Cliente {

  public Cliente(IRestricaoRepositorio restricaoRepositorio, String CPF) {
    if (restricaoRepositorio.existeRestricao(CPF)) {
      //throw new DomainBusiness
    }
  }
}
