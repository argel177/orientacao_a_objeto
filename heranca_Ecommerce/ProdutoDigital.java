
public class ProdutoDigital extends Produto {

    public ProdutoDigital(String n, double val) {
        super(n, val);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase;
    }
}
