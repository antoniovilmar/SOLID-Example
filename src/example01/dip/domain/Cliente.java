package example01.dip.domain;

import example01.dip.infra.RestricaoRepositorio;

public class Cliente {

  public Cliente(RestricaoRepositorio restricaoRepositorio, String CPF) {
    if (restricaoRepositorio.existeRestricao(CPF)) {
      //throw new DomainBusiness
    }
  }
}
