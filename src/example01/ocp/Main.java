package example01.ocp;

public class Main {

  public static void main(String[] args) {

    var calculadora = new Calculadora();
    System.out.println(calculadora.calcular(10, 5, OperacaoAritmetica.SOMA));
  }


}
