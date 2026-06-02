
public class mainPagamento {

    public static void main(String[] args) {
        PagamentoBoleto boleto = new PagamentoBoleto(500);
        PagamentoCartao cartao = new PagamentoCartao(1000);
        boleto.processarPagamento();
        cartao.processarPagamento();

    }

}
