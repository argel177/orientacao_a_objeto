
public class ContaCorrente extends Conta {

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + 2.0;

        if (saldo >= valorTotal) {
            saldo -= valorTotal;
            return true;
        }

        return false;
    }
}
