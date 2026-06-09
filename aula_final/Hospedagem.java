
public class Hospedagem {

    protected Quarto quarto;
    protected Hospede hospede;
    protected int diarias;
    protected boolean isAtivo;
    protected double valorTotal;

    public Hospedagem(Quarto q, Hospede h, int d) {
        this.quarto = q;
        this.hospede = h;
        this.diarias = d;
        this.isAtivo = true;
        this.valorTotal = 0;
    }

    public Quarto getQuarto() {
        return this.quarto;
    }

    public Hospede getHospede() {
        return this.hospede;
    }

    public int getDiarias() {
        return this.diarias;
    }

    public boolean getIsAtivo() {
        return this.isAtivo;
    }

    public void setIsAtivo(boolean status) {
        this.isAtivo = status;

    }

    public double getvalorTotal() {
        return this.valorTotal;
    }

    public void setvalorTotal(double valor) {
        this.valorTotal = valor;
    }

}
