
public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double v) {
        super(v);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento sendo processado ..." + this.valor);
    }

}
