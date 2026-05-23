
public class Quarto {

    private int numero;
    private String tipo;
    private double valorDiaria;
    private int diasOcupados;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;

        if (tipo.equalsIgnoreCase("Simples")) {
            this.valorDiaria = 100.00;
        } else if (tipo.equalsIgnoreCase("Luxo")) {
            this.valorDiaria = 250.00;
        }
        this.ocupado = false;
        this.diasOcupados = 0;
        this.hospedeAtual = null;
    }

    public void checkIn(Hospede novoHospede, int dias) {

        if (!ocupado) {
            ocupado = true;
            hospedeAtual = novoHospede;
            diasOcupados = dias;

            System.out.println("Check-in realizado com sucesso!");
        } else {
            System.out.println("O quarto já está ocupado.");
        }
    }

    public double checkOut() {

        double total = diasOcupados * valorDiaria;

        ocupado = false;
        diasOcupados = 0;
        hospedeAtual = null;

        return total;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public int getDiasOcupados() {
        return diasOcupados;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Hospede getHospedeAtual() {
        return hospedeAtual;
    }
}
