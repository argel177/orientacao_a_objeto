
public class ContaInvestimento extends Conta {

    public ContaInvestimento(String titular) {
        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = valor * 0.01;
        double valorTotal = valor + taxa;

        if (saldo >= valorTotal) {
            saldo -= valorTotal;
            return true;
        }

        return false;
    }
}
