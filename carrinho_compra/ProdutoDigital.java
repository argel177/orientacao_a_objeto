
class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.90; // 10% de desconto
    }
}
