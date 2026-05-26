
public class Conta {

    protected String Titutar;
    protected double saldo;

    public Conta(String t) {
        this.Titutar = t;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
        System.out.println("depósito realizado com sucesso");
    }

    public double getSaldo() {
        return this.saldo;
    }
}
