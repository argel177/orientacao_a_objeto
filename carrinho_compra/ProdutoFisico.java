
public class ProdutoFisico extends Produto {

    protected double pesoKg;

    public ProdutoFisico(String nome, double precoBase, double pesoKg) {
        super(nome, precoBase);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoFinal() {
        double frete = pesoKg * 5.0;
        return precoBase + frete;
    }
}
