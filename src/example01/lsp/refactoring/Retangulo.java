package example01.lsp.refactoring;

public class Retangulo implements IFormaGeometrica {

  private double altura;
  private double comprimento;

  public Retangulo(double altura, double comprimento) {
    this.altura = altura;
    this.comprimento = comprimento;
  }

  @Override
  public double calcularArea() {
    return this.altura * this.comprimento;
  }
}
