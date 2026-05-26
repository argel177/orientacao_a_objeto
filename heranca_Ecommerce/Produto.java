
public class Produto {

    protected String nome;
    protected double precoBase;

    public Produto(String n, double val) {
        this.nome = n;
        this.precoBase = val;
    }

    public double calcularPrecoFinal() {
        return this.precoBase * 1.10;
    }
}
