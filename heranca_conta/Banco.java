
public class Banco {

    public static void main(String[] args) {

        Conta conta1 = new Conta("Argel");

        conta1.depositar(100);

        double saldoAtual = conta1.getSaldo();

        System.out.println(saldoAtual);

        ContaPoupanca p1 = new ContaPoupanca("Argel");
        p1.depositar(100);
        saldoAtual = p1.getSaldo();
        System.out.println("saldo atual " + saldoAtual);
        p1.renderJuros();
        saldoAtual = p1.getSaldo();
        System.out.println("saldo atual " + saldoAtual);

    }
}
