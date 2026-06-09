
public class QuartoLuxo extends Quarto {

    public QuartoLuxo(int numero, double valorDiaria) {
        super(numero, valorDiaria);
    }

    @Override
    public double calcularTotal(int diarias) {
        return (this.precoBase * diarias) * 1.2;
    }
}
