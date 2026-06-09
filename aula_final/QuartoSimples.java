
public class QuartoSimples extends Quarto {

    public QuartoSimples(int numero, double valorDiaria) {
        super(numero, valorDiaria);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase * diarias;
    }
}
