
public class mainConta {

    public static void main(String[] args) {

        ContaCorrente joao = new ContaCorrente("João");
        joao.depositar(100.0);

        ContaInvestimento maria = new ContaInvestimento("Maria");
        maria.depositar(100.0);
        joao.transferir(maria, 50.0);
        maria.transferir(joao, 20.0);

        System.out.println("\nSaldo final:");
        System.out.println(joao.getTitular() + ": R$ " + joao.getSaldo());
        System.out.println(maria.getTitular() + ": R$ " + maria.getSaldo());
    }
}
