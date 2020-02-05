package example01.ocp.refactoring;

public abstract class EmissaoExtrato {

  private StringBuilder stringBuilder;

  public EmissaoExtrato() {
    stringBuilder = new StringBuilder();
  }

  abstract StringBuilder definirCabecalho();

  abstract StringBuilder definirCorpo();

  abstract StringBuilder definirRodape();

  public String emitir() {
    final var stringBuilder = new StringBuilder();
    stringBuilder.append(definirCabecalho().append("\n\n"));
    stringBuilder.append(definirCorpo().append("\n\n"));
    stringBuilder.append(definirRodape());
    return stringBuilder.toString();
  }

}
