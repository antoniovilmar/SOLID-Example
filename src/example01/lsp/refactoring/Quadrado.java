package example01.lsp.refactoring;

public class Quadrado implements IFormaGeometrica {

  private double alturaOuComprimento;

  public Quadrado(double alturaOuComprimento) {
    this.alturaOuComprimento = alturaOuComprimento;
  }

  @Override
  public double calcularArea() {
    return this.alturaOuComprimento * this.alturaOuComprimento;
  }
}
