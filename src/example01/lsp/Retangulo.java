package example01.lsp;

public class Retangulo {

  private double altura;
  private double comprimento;

  public Retangulo(double altura, double comprimento) {
    this.altura = altura;
    this.comprimento = comprimento;
  }

  public double getAltura() {
    return altura;
  }

  public double getComprimento() {
    return comprimento;
  }

  public double getArea() {
    return this.altura * this.comprimento;
  }
}
