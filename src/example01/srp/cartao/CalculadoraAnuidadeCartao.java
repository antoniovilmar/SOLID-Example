package example01.srp.cartao;


public class CalculadoraAnuidadeCartao {

  private final int CINQUENTA_MIL = 50000;
  private final int TRINTA_MIL = 30000;
  private final int DOZE_MIL = 12000;

  public double calcular(Cliente cliente) {
    if (ModalidadeCartao.BLACK.equals(cliente.getModalidadeCartao())) {
      return calcularAnuidadeParaCartaoBlack(cliente);
    }

    if (ModalidadeCartao.GOLD.equals(cliente.getModalidadeCartao())) {
      return calcularAnuidadeParaCartaoGold(cliente);
    }

    return calcularAnuidadeParaCartaoInternacional(cliente);
  }

  private double calcularAnuidadeParaCartaoGold(Cliente cliente) {
    if (cliente.getTotalGastoUltimoAno() > DOZE_MIL || cliente.temContaBancaria()) {
      return 0;
    }

    return 250;
  }


  private double calcularAnuidadeParaCartaoInternacional(Cliente cliente) {
    if (cliente.temContaBancaria()) {
      return 0;
    }

    return 120;
  }

  private double calcularAnuidadeParaCartaoBlack(Cliente cliente) {
    if (cliente.getTotalGastoUltimoAno() > CINQUENTA_MIL && cliente.temContaBancaria()) {
      return 0;
    } else if (cliente.getTotalGastoUltimoAno() > TRINTA_MIL) {
      return 300;
    } else {
      return 800;
    }
  }


}
