
public class ProdutoFisico extends Produto {

    public ProdutoFisico(String n, double val) {
        super(n, val);
    }

    @Override
    public double calcularPrecoFinal() {
        return (this.precoBase * 1.10) + 50.0;
    }
}
