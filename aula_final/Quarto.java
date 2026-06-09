
public abstract class Quarto implements Financeiro {

    protected int numero;
    protected double precoBase;
    protected boolean isOcupado;

    public Quarto(int n, double valorDiaria) {
        this.numero = n;
        this.precoBase = valorDiaria;
        this.isOcupado = false;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public boolean getIsOcupado() {
        return this.isOcupado;
    }

    public void setIsOcupado(boolean status) {
        this.isOcupado = status;

    }
}
