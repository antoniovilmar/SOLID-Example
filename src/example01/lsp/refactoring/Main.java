package example01.lsp.refactoring;


public class Main {

  public static void main(String[] args) {
    var retangulo = new Retangulo(3, 5);
    var quadrado = new Quadrado(6);

    imprimirArea(retangulo);
    imprimirArea(quadrado);

  }

  private static void imprimirArea(IFormaGeometrica formaGeometrica) {
    System.out.println(formaGeometrica.calcularArea());
  }

}
