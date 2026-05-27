
class ProdutoPerecivel extends ProdutoFisico {

    private int diasParaVencer;

    public ProdutoPerecivel(String nome, double precoBase,
            double pesoKg, int diasParaVencer) {
        super(nome, precoBase, pesoKg);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcularPrecoFinal() {
        double total = super.calcularPrecoFinal();

        if (diasParaVencer <= 3) {
            total = total * 0.70; // desconto de 30%
        }

        return total;
    }
}
