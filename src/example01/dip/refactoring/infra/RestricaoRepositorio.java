package example01.dip.refactoring.infra;

import example01.dip.refactoring.domain.IRestricaoRepositorio;

public class RestricaoRepositorio implements IRestricaoRepositorio {

  @Override
  public boolean existeRestricao(String cpf) {
    return false;
  }
}
