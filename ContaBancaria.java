
public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titu) {
        this.titular = titu;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Erro: saldo insuficiente.");
        }

    }
}
