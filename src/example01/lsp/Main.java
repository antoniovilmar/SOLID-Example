package example01.lsp;

public class Main {

  public static void main(String[] args) {
    var retangulo = new Retangulo(3, 5);
    var quadrado = new Quadrado(6);

    imprimirArea(retangulo);
    imprimirArea(quadrado);

    //TODO QUADRADO É UM RETANGULO, MAS NEM TODO RETANGULO É UM QUADRADO

  }

  private static void imprimirArea(Retangulo retangulo) {
    System.out.println(retangulo.getArea());
  }

}
